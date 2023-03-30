//package com.api.service;
//
//import java.security.Principal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//
//import com.api.entity.EmailDetails;
//import com.api.repository.EmailRepository;
//
//public class EmailService {
//
//	
//	@Autowired
//	EmailRepository emailRepo;
//	
//	@Autowired
//	JavaMailSender javaMailSender;
//	
//		public String sendSimpleMail(EmailDetails details)
//		 {
//			 Principal nam=new Principal() {
//					
//					@Override
//					public String getName() {
//					 if(getName()!=null)
//						 try {
//					         // Creating a simple mail message
//					         SimpleMailMessage mailMessage = new SimpleMailMessage();
//					    	 
//
//					         // Setting up necessary details
//					         mailMessage.setFrom("avanishas123@outlook.com");
//					         mailMessage.setTo(details.getRecipient());
//					         mailMessage.setCc(details.getCcList());
//					        // mailMessage.setBcc(details.getBccList());
//					         mailMessage.setText(details.getMsgBody());
//					         mailMessage.setSubject(details.getSubject());
//					         
//					         // Sending the mail
//					         javaMailSender.send(mailMessage);
//					         details.setEmailStatus("Send");
//					        emailRepo.save(details);
//					         return "Mail Sent Successfully...";
//					     }
//
//					    //  Catch block to handle the exceptions
//					     catch (Exception e) {
//					    	 details.setEmailStatus("Failed");
//					        emailRepo.save(details);
//					          
//					         return "Error while Sending Mail";
//					     }
//					 
//					return null;
//					}
//				};
//		     // Try block to check for exceptions
//			return null;
//		     
//		 }
//
//}
