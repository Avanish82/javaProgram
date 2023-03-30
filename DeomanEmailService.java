//package com.app.service;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//
//import com.app.entity.EmailDetails;
//import com.azure.core.credential.TokenCredential;
//import com.azure.core.implementation.Option;
//import com.microsoft.aad.msal4j.ClientCredentialFactory;
//import com.microsoft.aad.msal4j.ClientCredentialParameters;
//import com.microsoft.aad.msal4j.ConfidentialClientApplication;
//import com.microsoft.aad.msal4j.IAuthenticationResult;
//import com.microsoft.aad.msal4j.IClientCredential;
//import com.microsoft.aad.msal4j.MsalException;
//import com.microsoft.aad.msal4j.SilentParameters;
//import com.microsoft.graph.authentication.IAuthenticationProvider;
//import com.microsoft.graph.authentication.TokenCredentialAuthProvider;
//import com.microsoft.graph.models.BodyType;
//import com.microsoft.graph.models.EmailAddress;
//import com.microsoft.graph.models.ItemBody;
//import com.microsoft.graph.models.Message;
//import com.microsoft.graph.models.OptionalClaim;
//import com.microsoft.graph.models.Recipient;
//import com.microsoft.graph.models.UserSendMailParameterSet;
//import com.microsoft.graph.requests.GraphServiceClient;
//
//public class DeomanEmailService {
//	
////	private final static String clientSecret="QAY8Q~TNvuHMO0pkS_x1lgrwBD0ilYNjVVG1-chc";
////    private final static String clientId = "08942e77-7f1c-4ee7-b0c8-33882039dcf1"; //Azure generated client id
////    private final static String tenantId = "68b4cc51-3bd3-4486-b00f-f08d372ed098"; //Azure generated tenant id 
////    private final static Set<String> scopes = Collections.singleton("https://graph.microsoft.com/.default");
////    		//"https://graph.microsoft.com/.default";
////    // private final static Set<String> SCOPE = Collections.singleton("Mail.Send User.ReadBasic.All");           //("User.Read User.ReadBasic.All");
////    private final static String USER_NAME = "avanishas123@outlook.com"; //fully qualified user name who is trying to get the token
////    private final static String Password="Avanish8285696415";
////    private final static String authUrl ="https://login.microsoftonline.com/68b4cc51-3bd3-4486-b00f-f08d372ed098/v2.0";
////
//    
//    private final static String CLIENT_ID = "08942e77-7f1c-4ee7-b0c8-33882039dcf1";
//    private final static String AUTHORITY = "https://login.microsoftonline.com/68b4cc51-3bd3-4486-b00f-f08d372ed098/";
//    private final static String CLIENT_SECRET = "QAY8Q~TNvuHMO0pkS_x1lgrwBD0ilYNjVVG1-chc";
//    private final static Set<String> SCOPE = Collections.singleton("https://graph.microsoft.com/.default");
//	 
//    public static void main(String args[]) throws Exception {
//        IAuthenticationResult result = acquireToken();
//        System.out.println("Access token: " + result.accessToken());
//      
//    
// 
////public String sendSimpleMail(EmailDetails details) {
//    	
//    	TokenCredential credential=(TokenCredential) acquireToken();
//		final TokenCredentialAuthProvider tokenCredentialAuthProvider = new TokenCredentialAuthProvider(credential);
//
//    	final GraphServiceClient graphClient =
//    	  GraphServiceClient
//    	    .builder()
//    	    .authenticationProvider(tokenCredentialAuthProvider)
//    	    .buildClient();
//
//		Message message = new Message();
//		message.subject = "Meet for lunch?";
//		ItemBody body = new ItemBody();
//		body.contentType = BodyType.TEXT;
//		body.content = "The new cafeteria is open.";
//		message.body = body;
//		LinkedList<Recipient> toRecipientsList = new LinkedList<Recipient>();
//		Recipient toRecipients = new Recipient();
//		EmailAddress emailAddress = new EmailAddress();
//		emailAddress.address = "avanishas123@outlook.com";
//		toRecipients.emailAddress = emailAddress;
//		toRecipientsList.add(toRecipients);
//		message.toRecipients = toRecipientsList;
//		//To
//		LinkedList<Recipient> toRecipientsList1 = new LinkedList<Recipient>();
//		Recipient toRecipients1 = new Recipient();
//		EmailAddress emailAddress1 = new EmailAddress();
//		emailAddress.address = "avanish.as@gmail.com";                        //Arrays.toString(details.getRecipient()); 
//		toRecipients.emailAddress = emailAddress1;
//		toRecipientsList.add(toRecipients1);
//		message.toRecipients = toRecipientsList1;
//       //CC
//		LinkedList<Recipient> toRecipientsList2 = new LinkedList<Recipient>();
//		Recipient toRecipients2 = new Recipient();
//		EmailAddress emailAddress2 = new EmailAddress();
//		emailAddress2.address = "avanishrajput003@gmail.com";                                       //Arrays.toString(details.getCcList());
//		toRecipients2.emailAddress = emailAddress2;
//		toRecipientsList2.add(toRecipients2);
//		message.toRecipients = toRecipientsList2;
//
////		LinkedList<Recipient> bccRecipientsList3 = new LinkedList<Recipient>();
////		Recipient bccRecipients3 = new Recipient();
////		EmailAddress emailAddress3 = new EmailAddress();
////		emailAddress3.address = Arrays.toString(details.getBccList());
////		bccRecipients3.emailAddress = emailAddress3;
////		bccRecipientsList3.add(bccRecipients3);
////		message.ccRecipients = bccRecipientsList3;
//		
//		 
//		boolean saveToSentItems = false;
//		
//		//String id= "c25ba25a-e4c0-4b73-b26f-9e9a995e86ec";
//
////		 graphClient.users("{id | userPrincipalName}")
//		graphClient.users("{id}")
//			.sendMail(UserSendMailParameterSet
//				.newBuilder()
//				.withMessage(message)
//				.withSaveToSentItems(saveToSentItems)
//				.build())
//			.buildRequest()
//			.post();
//			//.postAsync();
//		// System.out.println(Arrays.deepToString(graphClient));
//		 System.out.println(Arrays.asList((graphClient)));
//		 System.out.println("hi dear"+graphClient);
//	 
//    }
//    private static IAuthenticationResult acquireToken() throws Exception {
//
//        // This is the secret that is created in the Azure portal when registering the application
//        IClientCredential credential = ClientCredentialFactory.createFromSecret(CLIENT_SECRET);
//        ConfidentialClientApplication cca =
//                ConfidentialClientApplication
//                        .builder(CLIENT_ID, credential)
//                        .authority(AUTHORITY)
//                        .build();
//
//        // Client credential requests will by default try to look for a valid token in the
//        // in-memory token cache. If found, it will return this token. If a token is not found, or the
//        // token is not valid, it will fall back to acquiring a token from the AAD service. Although
//        // not recommended unless there is a reason for doing so, you can skip the cache lookup
//        // by using .skipCache(true) in ClientCredentialParameters.
//        ClientCredentialParameters parameters =
//                ClientCredentialParameters
//                        .builder(SCOPE)
//                        .build();
//
//        return cca.acquireToken(parameters).join();
//    }
//     
//}
//    
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//	
////	private static IAuthenticationResult acquireToken() throws Exception {
////
////	     // Load token cache from file and initialize token cache aspect. The token cache will have
////	     // dummy data, so the acquireTokenSilently call will fail.
////	     TokenCacheAspect tokenCacheAspect = new TokenCacheAspect("sample_cache.json");
////
////		
////	     IClientCredential credential = ClientCredentialFactory.createFromSecret(clientSecret);
////	     ConfidentialClientApplication cca =
////	             ConfidentialClientApplication
////	                     .builder(clientId, credential)
////	                     .authority(tenantId)
////	                     .setTokenCacheAccessAspect(tokenCacheAspect)
////	                     .build();
////
////	     IAuthenticationResult result;
////	     try {
////	         SilentParameters silentParameters =
////	                 SilentParameters
////	                         .builder(scopes)
////	                         .build();
////
////	         // try to acquire token silently. This call will fail since the token cache does not
////	         // have a token for the application you are requesting an access token for
////	         result = cca.acquireTokenSilently(silentParameters).join();
////	     } catch (Exception ex) {
////	         if (ex.getCause() instanceof MsalException) {
////
////	             ClientCredentialParameters parameters =
////	                     ClientCredentialParameters
////	                             .builder(scopes)
////	                             .build();
////
////	             // Try to acquire a token. If successful, you should see
////	             // the token information printed out to console
////	             result = cca.acquireToken(parameters).join();
////	         } else {
////	             // Handle other exceptions accordingly
////	             throw ex;
////	         }
////	     }
////	     return result;
////	 }
////
////}
//    
//    
////    //working code get azure token
////    public static void main(String args[]) throws Exception {
////        IAuthenticationResult result = acquireToken();
////        System.out.println("Access token: " + result.accessToken());
////    }
////
////    private static IAuthenticationResult acquireToken() throws Exception {
////
////        // This is the secret that is created in the Azure portal when registering the application
////        IClientCredential credential = ClientCredentialFactory.createFromSecret(CLIENT_SECRET);
////        ConfidentialClientApplication cca =
////                ConfidentialClientApplication
////                        .builder(CLIENT_ID, credential)
////                        .authority(AUTHORITY)
////                        .build();
////
////        // Client credential requests will by default try to look for a valid token in the
////        // in-memory token cache. If found, it will return this token. If a token is not found, or the
////        // token is not valid, it will fall back to acquiring a token from the AAD service. Although
////        // not recommended unless there is a reason for doing so, you can skip the cache lookup
////        // by using .skipCache(true) in ClientCredentialParameters.
////        ClientCredentialParameters parameters =
////                ClientCredentialParameters
////                        .builder(SCOPE)
////                        .build();
////
////        return cca.acquireToken(parameters).join();
////    }
////}
