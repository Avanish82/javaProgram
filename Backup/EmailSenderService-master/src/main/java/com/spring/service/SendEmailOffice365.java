package com.spring.service;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.spring.entity.EmailEntity;

public class SendEmailOffice365 {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    private static final String SERVIDOR_SMTP = "smtp.office365.com";
    private static final int PORTA_SERVIDOR_SMTP = 587;
    private static final String CONTA_PADRAO = "avanish.as@outlook.com";
    private static final String SENHA_CONTA_PADRAO = "Avanishkumar";

    private final String from = "avanish.as@outlook.com";
  //  private final String to = "avanishas123@outlook.com";

   // private final String subject = "Teste";
   // private final String messageContent = "Teste de Mensagem";

    public String sendEmail(EmailEntity details) {
        final Session session = Session.getInstance(this.getEmailProperties(), new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(CONTA_PADRAO, SENHA_CONTA_PADRAO);
            }

        });

        try {
        	EmailEntity obj=new EmailEntity();
            final Message message = new MimeMessage(session);
            
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(obj.getRecipient()));
            message.setFrom(new InternetAddress(from));
            message.setSubject(obj.getSubject());
            message.setText(obj.getMsgBody());
            message.setSentDate(new Date());
            Transport.send(message);
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setFrom(new InternetAddress(from));
//            message.setSubject(subject);
//            message.setText(messageContent);
//            message.setSentDate(new Date());
//            Transport.send(message);
        } catch (final MessagingException ex) {
            LOGGER.log(Level.WARNING, "Erro ao enviar mensagem: " + ex.getMessage(), ex);
        }
		return "Hi";
    }

    public Properties getEmailProperties() {
        final Properties config = new Properties();
        config.put("mail.smtp.auth", "true");
        config.put("mail.smtp.starttls.enable", "true");
        config.put("mail.smtp.host", SERVIDOR_SMTP);
        config.put("mail.smtp.port", PORTA_SERVIDOR_SMTP);
       // To get this to work now, add
        config.put("mail.smtp.ssl.protocols", "TLSv1.2");
        return config;
    }

    public static void main(final String[] args) {
        EmailEntity details=null;
		new SendEmailOffice365().sendEmail(details);
    }

}
