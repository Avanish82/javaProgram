package com.icicihfc.services.security.services;

import com.icicihfc.services.employee.dtos.EmployeeOperationDTO;
import com.icicihfc.services.utils.AdEmployeeDetails;
import com.icicihfc.services.utils.ResponseObj;
import com.icicihfc.services.utils.Validators;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.naming.AuthenticationException;
import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import java.net.ConnectException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.StringTokenizer;

@Slf4j
@Service
public class LdapService {

    private static final String TAG = LdapService.class.getName();

    ResponseObj responseObj = new ResponseObj();

    private static int INDVAL = 0;

    private static String INITCTX = "";

    static String ret_s5 = "";

    @Value("${ldap.ip.list}")
    private String URL;

    @Value("${ldap.domains}")
    private String domains;

    @Value("${ldap.service.userid}")
    private String serviceUserId;

    @Value("${ldap.service.password}")
    private String servicePassword;

    @Value("${is_live_build}")
    private boolean isLiveBuild;

    @Value("${is.uat.server}")
    private boolean isUatServer;

    //	ldap://10.16.1.117:3268;ldap://10.16.17.121:3268;ldap://10.0.3.22:3268;ldap://10.16.1.116:3268;ldap://10.0.3
    //	.20:3268;ldap://10.0.3.22:3268;ldap://10.0.3.25:3268;
    private static String[] URLARR = {""};

    private static String USRPRNCPL = "";
    private static final Log logger = LogFactory.getLog(LdapService.class);

    String ret_mesg = "Welcome ";

    /**
     * default constructor
     */
    public LdapService() {
    }

    @PostConstruct
    private void postConstruct() {
        Properties properties = new Properties();
        try {

//			BufferedInputStream bufferedinputstream = new BufferedInputStream(
//					Ldap.class.getResourceAsStream("/env.properties"));
//			properties.load(bufferedinputstream);
            // fileinputstream.close();
//			bufferedinputstream.close();
            // fileinputstream.close();
            INITCTX = "com.sun.jndi.ldap.LdapCtxFactory";
            System.out.println("INITCTX==>" + INITCTX);
            System.out.println("URLs ==>" + URL);
            if (isLiveBuild && isUatServer) {
//                URL = "ldap://10.24.153.129:3268;" + URL;
                System.out.println("URLs 2 ==>" + URL);
            }
            String URLprop = URL;
            StringTokenizer sturl = new StringTokenizer(URLprop, ";");
            int ind = 0;
            while (sturl.hasMoreTokens()) {
                sturl.nextToken();
                ++ind;
            }
            INDVAL = ind;
            ind = 0;
            sturl = new StringTokenizer(URLprop, ";");
            URLARR = new String[INDVAL];
            while (ind < INDVAL) {
                URLARR[ind] = sturl.nextToken();
                ++ind;
            }
            INDVAL = ind;
        } catch (Exception exception) {
            log.error(TAG, exception);
            System.out.println("exception____" + exception);
        }
    }

    public ResponseObj startLdap(EmployeeOperationDTO request) {

        log.info("Domains -> " + domains);

//        if (isLiveBuild && isUatServer) {
//            domains = "ICICIBANKLTD,com;" + domains;
//            log.info("Domains 2 -> " + domains);
//        }

        String[] splitDomains = domains.split(";");

        logger.info("Inside LDAP");
        logger.info("LDAP request employeeId :" + request.getEmployeeId());
        logger.info("LDAP request password :" + request.getPassword());
        ResponseObj data = new ResponseObj();
        for (String domain : splitDomains) {
            if (Validators.isNotNullAndNotEmpty(domain)) {
                logger.info("DOMAINS - " + domain);
                String[] domainSplit = domain.split(",");
                try {
                    LdapService ad = new LdapService();
                    data = ad.authenticateUser(request.getEmployeeId(), request.getPassword(), domainSplit[0],
                            domainSplit[1]);
                    logger.info(" LDAP response status:: " + data.getStatusCode());
                    logger.info("LDAP response message:: " + data.getMessage());
                    logger.info("LDAP response data:: " + data.getData());

                    if (data.getStatusCode() == HttpStatus.OK.value()) {
                        return data;
                    }
                } catch (Exception e) {
                    log.error(TAG, e);
                }
            }
        }
        return data;
    }


    /**
     * Description of the Method
     *
     * @param s    Description of the Parameter
     * @param s1   Description of the Parameter
     * @param dom  Description of the Parameter
     * @param dom2
     * @return Description of the Return Value
     * @throws Exception Description of the Exception
     */
    public ResponseObj authenticateUser(String s, String s1, String dom, String dom2) throws Exception {
        logger.info("LDAP authentication started");
        HashMap<Object, Object> data = new HashMap<Object, Object>();
        InitialDirContext initialdircontext = null;
        Hashtable<Object, Object> hashtable = null;
        Hashtable hashtable1 = null;


        boolean flag = false;
        int ind = 0;
        String retmsg = "NO|Initial";
        String excep = "";
        while ((!flag) && (ind < INDVAL)) {
            try {
                URL = URLARR[ind];
                logger.info("URL = " + URL);

                hashtable = new Hashtable<Object, Object>();

                hashtable.put(Context.INITIAL_CONTEXT_FACTORY, INITCTX);

                hashtable.put(Context.PROVIDER_URL, URL);
                hashtable.put("com.sun.jndi.ldap.connect.timeout", "1000");
                hashtable.put("com.sun.jndi.ldap.read.timeout", "1000");
                hashtable.put("com.sun.jndi.dns.timeout.retries", 1);

                hashtable1 = getDN(s, dom, dom2);
                String s2 = (String) hashtable1.get("distinguishedName");
                USRPRNCPL = s2;
                String s5 = (String) hashtable1.get("name");

                String inputStr = s5;
                String patternStr = "/";
                String[] fields = inputStr.split(patternStr);
                s5 = new String(fields[0]);

                ret_s5 = new String(s5);
                ret_mesg = ret_mesg + ret_s5;
                log.info("Principal - " + USRPRNCPL);
                hashtable.put("java.naming.security.authentication", "simple");
                hashtable.put("java.naming.security.principal", USRPRNCPL);
                hashtable.put("java.naming.security.credentials", s1);

                flag = true;
                try {
                    initialdircontext = new InitialDirContext(hashtable);
                    log.info("context - " + initialdircontext);

                    retmsg = "YES|" + ret_s5;
                    data.put("success", flag);
                    data.put("EmployeeName", ret_s5);
                    logger.info("retmsg :: " + retmsg);
                    logger.info("authenticated data :: " + data);
                    AdEmployeeDetails adEmployeeDetails = new AdEmployeeDetails();
                    adEmployeeDetails.setDistinguishedName((String) hashtable1.get("distinguishedName"));
                    adEmployeeDetails.setEmailId((String) hashtable1.get("mail"));
                    adEmployeeDetails.setMailNickName((String) hashtable1.get("mailNickname"));
                    adEmployeeDetails.setName((String) hashtable1.get("name"));
                    adEmployeeDetails.setSAMAccountName((String) hashtable1.get("sAMAccountName"));
                    responseObj.setStatusCode(200);
                    responseObj.setMessage("User authenticated successfully");
                    responseObj.setData(adEmployeeDetails);

                } catch (CommunicationException ce) {
                    logger.info("CommunicationException occured in " + URL);
                    flag = false;
                    retmsg = "NO|Invalid Username/Password";
                    ret_mesg = "Invalid Username/Password !!!";
                    data.put("success", flag);
                    responseObj.setStatusCode(400);
                    responseObj.setMessage("User authentication failed -> " + ret_mesg);
                    responseObj.setData(null);
                    logger.info("AuthenticationException occured in" + ret_mesg);

                    throw new Exception("CANNOT CONNECT LDAP SERVER");

                } catch (AuthenticationException ae) {
                    logger.info("AuthenticationException occured in " + URL);
                    flag = false;
                    retmsg = "NO|Invalid Username/Password";
                    ret_mesg = "Invalid Username/Password !!!";
                    data.put("success", flag);
                    responseObj.setStatusCode(400);
                    responseObj.setMessage("User authentication failed");
                    responseObj.setData(null);
                    logger.info("CommunicationException" + ret_mesg);
                    throw new Exception("INVALID USERNAME OR PASSWORD");

                } catch (Exception exception) {
                    logger.info(exception.getMessage());
                    flag = false;
                    retmsg = "NO|Invalid Username/Password";
                    ret_mesg = "Invalid Username/Password !!!";
                    data.put("success", flag);
                    responseObj.setStatusCode(400);
                    responseObj.setMessage("User authentication failed");
                    responseObj.setData(null);
                    logger.info("exception.getMessage()" + ret_mesg);
                    throw new Exception("INVALID USERNAME OR PASSWORD");

                }
            } catch (ConnectException coe) {
                log.error(TAG, coe);
            } catch (Exception exception) {
                log.error(TAG, exception);
                flag = false;
                ret_mesg = exception.toString();
                excep = exception.toString();

                if (excep.equals("java.lang.Exception: INVALID USERNAME OR PASSWORD")) {
                    logger.info("INVALID USERNAME OR PASSWORD exception occured for " + URL);
                    data.put("success", flag);
                    responseObj.setStatusCode(400);
                    responseObj.setMessage("INVALID USERNAME OR PASSWORD exception occured for " + URL);
                    responseObj.setData(null);
                    break;
                }

                if (excep.equals("java.lang.Exception: CANNOT CONNECT LDAP SERVER")) {
                    logger.info("CANNOT CONNECT LDAP SERVER exception occured for " + URL);
                    data.put("success", flag);
                    responseObj.setStatusCode(400);
                    responseObj.setMessage("CANNOT CONNECT LDAP SERVER exception occured for " + URL);
                    responseObj.setData(null);
                }

            } finally {
                if (hashtable1 != null)
                    hashtable1 = null;
                if (hashtable != null)
                    hashtable = null;
            }
            ++ind;
            logger.info("ind : " + ind);

            if (ind == INDVAL) {
                break;
            }

        } // WHILE
        if (!flag) {
            // throw new Exception("INVALID USERNAME OR PASSWORD");
            retmsg = "INVALID USERNAME OR PASSWORD";
            data.put("success", flag);
            responseObj.setStatusCode(400);
            responseObj.setMessage(retmsg);
            responseObj.setData(null);
        }
        return responseObj;
    }

    /**
     * Description of the Method
     *
     * @param attributes Description of the Parameter
     * @param hashtable  Description of the Parameter
     * @return Description of the Return Value
     * @throws Exception Description of the Exception
     */
    public Hashtable formatAttributes(Attributes attributes, Hashtable hashtable) throws Exception {
        if (attributes == null)
            throw new Exception("This result has no attributes");
        try {
            for (NamingEnumeration namingenumeration = attributes.getAll(); namingenumeration.hasMore(); ) {
                Attribute attribute = (Attribute) namingenumeration.next();
                for (NamingEnumeration namingenumeration1 = attribute.getAll(); namingenumeration1.hasMore(); hashtable
                        .put(attribute.getID(), namingenumeration1.next()))
                    ;

            }

        } catch (NamingException namingexception) {
            throw new Exception("This result has no attributes");
        }
        return hashtable;
    }

    /**
     * Description of the Method
     *
     * @param namingenumeration Description of the Parameter
     * @return Description of the Return Value
     * @throws Exception Description of the Exception
     */
    public Hashtable formatResults(NamingEnumeration namingenumeration) throws Exception {
        int i = 0;
        Hashtable hashtable = null;
        try {
            while (namingenumeration.hasMore()) {
                hashtable = new Hashtable();
                SearchResult searchresult = (SearchResult) namingenumeration.next();
                formatAttributes(searchresult.getAttributes(), hashtable);
                i++;
            }

        } catch (NamingException namingexception) {
            log.error(TAG, namingexception);
            throw new Exception("No Result Found");
        }
        return hashtable;
    }

    /**
     * Gets the dirContext attribute of the Ad_bean object
     *
     * @return The dirContext value
     * @throws Exception Description of the Exception
     */
    public DirContext getDirContext() throws Exception {
        int ind = 0;
        Hashtable<Object, Object> hashtable = null;
        // String excep = "";
        boolean flag = false;
        while ((!flag) && (ind < INDVAL)) {
            try {
                InitialDirContext initialdircontext = null;
                hashtable = new Hashtable<Object, Object>();
                String conurl = URLARR[ind];

                /*
                 * +ed: Sunil Chavan{27/11/2012} Using Constant instead of hardcoded property
                 * name
                 */
                // hashtable.put("java.naming.factory.initial", INITCTX);
                // hashtable.put("java.naming.provider.url", conurl);
                hashtable.put(Context.INITIAL_CONTEXT_FACTORY, INITCTX);
                hashtable.put(Context.PROVIDER_URL, conurl);

                /*
                 * +ed: Sunil Chavan{27/11/2012} Try only for 3 sec and only 1 try
                 */
                hashtable.put("com.sun.jndi.ldap.connect.timeout", "1000");
                hashtable.put("com.sun.jndi.ldap.read.timeout", "1000");
                hashtable.put("com.sun.jndi.dns.timeout.retries", 1);

                initialdircontext = new InitialDirContext(hashtable);
                return initialdircontext;
            } catch (Exception exception) {
                log.error(TAG, exception);
                ind++;
                flag = false;
            } finally {
                if (hashtable != null)
                    hashtable = null;
            }
        }
        throw new Exception("CONNECTION ERROR");
    }

    /**
     * Gets the dN attribute of the Ad_bean object
     *
     * @param s    employee id of the user to be searched
     * @param dom  domain name where to search the user
     * @param dom2
     * @return The dN value
     * @throws Exception Description of the Exception
     */
    private Hashtable getDN(String s, String dom, String dom2) throws Exception {
        logger.info("inside getDN");
        DirContext dircontext = null;
        try {
            dircontext = getDirContext();
        } catch (Exception e) {
            log.error(TAG, e);
            throw e;
        }

        String as[] = {"mailNickName", "distinguishedName", "mail", "name", "lname", "sAMAccountName"};
        SearchControls searchcontrols = new SearchControls();
        searchcontrols.setReturningAttributes(as);
        searchcontrols.setSearchScope(2);
        StringBuffer s1 = new StringBuffer("(&(sAMAccountName=");// "(&(sAMAccountName="
        // + s +
        // ")( distinguishedName=*))"
        // ;
        s1.append(s);
        s1.append(")( distinguishedName=*))");
        NamingEnumeration namingenumeration = dircontext.search("DC=" + dom + ",DC=" + dom2, s1.toString(),
                searchcontrols);
        Hashtable hashtable = formatResults(namingenumeration);
        if (hashtable == null) {
            ret_mesg = "Employee No Does not\t\t\tthrow new Exception(\"Employee No Does not Exist\");\n Exist";
            throw new Exception("Employee No Does not Exist");
        } else {
            logger.info("getDN hashtable :: " + hashtable);
            dircontext.close();
            return hashtable;
        }
    }
}
