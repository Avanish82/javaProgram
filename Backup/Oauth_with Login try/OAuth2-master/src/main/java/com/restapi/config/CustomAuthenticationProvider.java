//package com.restapi.config;
//
//import java.util.Hashtable;
//
//import javax.naming.AuthenticationException;
//import javax.naming.Context;
//import javax.naming.NamingException;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//
//import com.restapi.RestApi;
//import com.restapi.entity.UserMaster;
//import com.restapi.service.CustomUserDetailsService;
//import com.restapi.service.LoginAttemptService;
//
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider{
//	
//	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RestApi.class); //(SpringBootZuulgatwayproxyApplication.class);
//	
//	@Autowired
//	CustomUserDetailsService userService;
//	
//	@Autowired
//	LoginAttemptService loginAttemptService;
//	
//	String IdapAccountToLookup = null;
//	
//	@Value("${Idap.url")
//	private String IdapADUrl;
//	
//	@Override
//	public Authentication authenticate(Authentication auth){
//		
//		String password = auth.getCredentials().toString();
//		
//		if(userService.loadUserByUsername(auth.getName()) != null) {
//			UserMaster user = userService.loadUserByUsername(auth.getName());
//			if(true) {
//				System.out.println("Here");
//				//if(authenticateUser(user.getLoginName(), password)){
//				if(true) {
//					logger.info("- Client Authenticated Successfully.");
//					logger.info("- User Authenticated Successfully. ");
//					System.out.println("Authorities |"+auth.getAuthorities());
//					//return new UsernamePasswordAuthenticaticationToken(auth.getName(), password, user.getAuthorities());
//					return new UsernamePasswordAuthenticationToken(auth.getName(), null, user.getAuthorities());
//				}else {
//					logger.info("- Authentication Failed. ");
//					loginAttemptService.loginAttemtFail(auth.getName());
//					throws new AuthenticationCredentialsNotFoundException("Unauthenticated User");
//				}
//			}
//		}else {
//			throw new RuntimeException("User is Looked");
//		}
//	}
//	
////	public boolean authenticateUser(String userName, String password) {
////		LdapContext IdapContext = null;
////		DirContext ctx = null;
////		Hashtable<String, Object> env = new Hashtable<String, Object>();
////		boolean userValidateFlag = true;
////		try {
////			env.put(Context.SECURITY_AUTHENTICATION, "simple");
////			if(userName != null) {
////				IdapAccountToLookup = userName;
////				userName = "crop\\" + userName;
////				env.put(Context.SECURITY_PRINCIPAL, userName.trim());
////			}
////			if(password != null) {
////				evn.put(Context.SECURITY_CREDENTIALS, password.trim());
////			}
////			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.Idap.LdapCtxFactory");
////			env.put.(Context.PROVIDER_URL, IdapAdUrl);
////			
////			env.put("java.naming.Idap.attributes.binary", "objectSID");
////			ctx = new InitialDirContext(env):
////		}catch(AuthenticationException e) {
////			userValidateFlag = false;
////			System.out.println(this.getClass().getName() + "ERROR " +e.getMessage());
////		}catch(NamingException e) {
////			System.out.println(this.getClass().getName() + "ERROR " +e.getMessage());
////		}catch(Exception e) {
////			System.out.println(this.getClass().getName() + "ERROR " +e.getMessage());
////		}
////		System.out.println("JUST OUTSIDE");
////		return userValidateFlag;
////		
////	}
//	
//	@Override
//	public boolean supports(Class<?> auth) {
//		return auth.equals(UsernamePasswordAuthenticationToken.class);
//	}
//	
//	
//
//}
