//package com.spring.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
// 
//import com.spring.entity.EmailEntity;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.File;
//
//@Service
//public class EmailSenderService {
//
//	 @Value("${spring.mail.username}") 
//	 private String sender;
//	 
//    @Autowired
//    JavaMailSender javaMailSender;
//    
//    public String sendEmailWithAttachment(EmailEntity details) {
//    {
//
//        // Try block to check for exceptions
//        try {
//            // Creating a simple mail message
//            SimpleMailMessage mailMessage = new SimpleMailMessage();
//
//            // Setting up necessary details
//            mailMessage.setFrom(sender);
//            mailMessage.setTo(details.getRecipient());
//            mailMessage.setCc(details.getCcList());
//            mailMessage.setBcc(details.getBccList());
//            mailMessage.setText(details.getMsgBody());
//            mailMessage.setSubject(details.getSubject());
//            
//            // Sending the mail
//            javaMailSender.send(mailMessage);
//           // details.setEmailStatus("Send");
//          //  emailRepo.save(details);
//            return "Mail Sent Successfully...";
//        }
//
//       //  Catch block to handle the exceptions
//        catch (Exception e) {
//       //	 details.setEmailStatus("Failed");
//          //  emailRepo.save(details);
//             
//            return "Error while Sending Mail";
//        }
//    }
//    }
//}

//   // public void sendEmailWithAttachment(String toEmail, String body, String subject, String attachment) throws MessagingException{
//    public String sendEmailWithAttachment(EmailEntity details) throws MessagingException { 
//   try {
//    	MimeMessage mimeMessage = mailSender.createMimeMessage();
//       
//    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
//    mimeMessage.setFrom(sender);
//    mimeMessage.set(details.getRecipient());
//    mimeMessage.setCc(details.getCcList());
//    mimeMessage.setBcc(details.getBccList());
//    mimeMessage.setText(details.getMsgBody());
//    mimeMessage.setSubject(details.getSubject());
////        messageHelper.setFrom("springemail46@gmail.com");
////        messageHelper.setTo("avanish.as@gmail.com");
////        messageHelper.setCc("entertinmentwithus@gmail.com ");
////       // messageHelper.setCc("rkg.aryan95@gmail.com");
////        messageHelper.setText(body);
////        messageHelper.setSubject(subject);
//
//        FileSystemResource fileSystem = new FileSystemResource(new File(details.getAttachment())); //(new File(attachment));
//		 
//        messageHelper.addAttachment(fileSystem.getFilename(), fileSystem);
//        mailSender.send(mimeMessage);
//        System.out.println("Email Send.....!");
//        System.out.println("Success");
//    }catch(Exception e) {
//    
//    }
//return  "hello";
//   
//    }
//   
//}
