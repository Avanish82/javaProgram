package com.spring.controller;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.EmailEntity;
import com.spring.service.SendEmailOffice365;
 
 
@RestController
public class EmailController {
	
//	 @Autowired 
//	 private EmailSenderService emailService;
	 private static final Logger logger = LoggerFactory.getLogger(EmailController.class);
	
	@Autowired
	SendEmailOffice365 sendEmailOffice365;
	
	 
	    // Sending a simple Email
	    @PostMapping("/sendMail")
	    public String sendMail(@RequestBody EmailEntity details) throws MessagingException
	    {
//	        String status = emailService.sendEmailWithAttachment(details);
	    	 String status = sendEmailOffice365.sendEmail(details);
	        
	        return status;
	    }

}
