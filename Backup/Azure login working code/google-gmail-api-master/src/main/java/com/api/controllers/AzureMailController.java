package com.api.controllers;

import java.security.Principal;
 
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController; 

 
 


@RestController
public class AzureMailController {
	
//	@Autowired
//	EmailService emailService;
//	
	 @GetMapping("/group1")
     @PreAuthorize("hasRole('ROLE_Group1')")
     public String group1() {
         return "Hello message";
     }

	 @GetMapping("/group2")
	   //  @ResponseBody
	 @PreAuthorize("hasRole('ROLE_Group1')")
	 public String group2(Principal principal) {
	   return "Admin message"+principal.getName();
	     }
//	 
//   @PostMapping("/azureMail")
//   @PreAuthorize("hasRole('ROLE_Group1')")
//   public String sendMail(@RequestBody EmailDetails details)
//   {
//       String status = emailService.sendSimpleMail(details);
//
//       return status;
//   }
	 
	 
	 
	 
	 
	 
	 
	 
	 
//		private static final String APPLICATION_NAME = "GmailAlexa";
//		private static HttpTransport httpTransport;
//		private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//		private static com.google.api.services.gmail.Gmail client;
//
//		 
////		GoogleClientSecrets clientSecrets;
////		GoogleAuthorizationCodeFlow flow;
////		Credential credential;
//
//		@Value("${spring.cloud.azure.active-directory.credential.client-id}")
//		private String clientId;
//
//		@Value("${spring.cloud.azure.active-directory.credential.client-secret}")
//		private String clientSecret;
//
//		@Value("${spring.cloud.azure.active-directory.credential.redirect-uri}")
//		private String redirectUri;
//
//		@RequestMapping(value = "/login/gmail", method = RequestMethod.GET)
//		public RedirectView googleConnectionStatus(HttpServletRequest request) throws Exception {
//			return new RedirectView(authorize());
//		}
//
//		@RequestMapping(value = "/login/gmailCallback", method = RequestMethod.GET, params = "code")
//		public ResponseEntity<String> oauth2Callback(@RequestParam(value = "code") String code) {
//
//			// System.out.println("code->" + code + " userId->" + userId + "
//			// query->" + query);
//
//			JSONObject json = new JSONObject();
//			JSONArray arr = new JSONArray();
//
//			// String message;
//			try {
//				TokenResponse response = flow.newTokenRequest(code).setRedirectUri(redirectUri).execute();
//				credential = flow.createAndStoreCredential(response, "userID");
//
//				client = new com.google.api.services.gmail.Gmail.Builder(httpTransport, JSON_FACTORY, credential)
//						.setApplicationName(APPLICATION_NAME).build();
//				
//				Filter filter = new Filter().setCriteria(new
//					  FilterCriteria().setFrom("entertinmentwithus@gmail.com"))
//						  .setAction(new FilterAction()); Filter result =
//						  client.users().settings().filters().create("me",
//						  filter).execute();
//						  
//						   System.out.println("Created filter " + result.getId());
//
//				/*
//				 * Filter filter = new Filter().setCriteria(new
//				 * FilterCriteria().setFrom("a2cart.com@gmail.com"))
//				 * .setAction(new FilterAction()); Filter result =
//				 * client.users().settings().filters().create("me",
//				 * filter).execute();
//				 * 
//				 * System.out.println("Created filter " + result.getId());
//				 */
//
//				String userId = "me";
//				String query = "subject:'Welcome to A2Cart'";
//				ListMessagesResponse MsgResponse = client.users().messages().list(userId).setQ(query).execute();
//
//				List<Message> messages = new ArrayList<>();
//
//				System.out.println("message length:" + MsgResponse.getMessages().size());
//
//				for (Message msg : MsgResponse.getMessages()) {
//
//					messages.add(msg);
//
//					Message message = client.users().messages().get(userId, msg.getId()).execute();
//					System.out.println("snippet :" + message.getSnippet());
//
//					arr.put(message.getSnippet());
//
//					/*
//					 * if (MsgResponse.getNextPageToken() != null) { String
//					 * pageToken = MsgResponse.getNextPageToken(); MsgResponse =
//					 * client.users().messages().list(userId).setQ(query).
//					 * setPageToken(pageToken).execute(); } else { break; }
//					 */
//				}
//				json.put("response", arr);
//
//				for (Message msg : messages) {
//
//					System.out.println("msg: " + msg.toPrettyString());
//				}
//
//			} catch (Exception e) {
//
//				System.out.println("exception cached ");
//				e.printStackTrace();
//			}
//
//			return new ResponseEntity<>(json.toString(), HttpStatus.OK);
//		}
//
//		private String authorize() throws Exception {
//			AuthorizationCodeRequestUrl authorizationUrl;
//			if (flow == null) {
//				Details web = new Details();
//				web.setClientId(clientId);
//				web.setClientSecret(clientSecret);
//				clientSecrets = new GoogleClientSecrets().setWeb(web);
//				httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//				flow = new GoogleAuthorizationCodeFlow.Builder(httpTransport, JSON_FACTORY, clientSecrets,
//						Collections.singleton(GmailScopes.GMAIL_READONLY)).build();
//			}
//			authorizationUrl = flow.newAuthorizationUrl().setRedirectUri(redirectUri);
//
//			System.out.println("gamil authorizationUrl ->" + authorizationUrl);
//			return authorizationUrl.build();
//		}
	

}
