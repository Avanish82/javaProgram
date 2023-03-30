//package com.spring.service;
//
//import java.net.MalformedURLException;
//
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MailHelper {
//    private String clientId;
//    private String clientSecret;
//    private String scope;
//    private String authority;
//    private String username;
//    private JavaMailSender emailSender;
//
//    private IAuthenticationResult getToken() throws MalformedURLException {
//        final IConfidentialClientApplication app = ConfidentialClientApplication.builder(
//                this.clientId, 
//                ClientCredentialFactory.createFromSecret(this.clientSecret))
//            .authority(this.authority)
//            .build();
//        final ClientCredentialParameters parameters = ClientCredentialParameters.builder(
//                Collections.singleton(this.scope))
//            .build();
//        return app
//            .acquireToken(parameters)
//            .join();
//    }
//
//    public void send(final MimeMessage message) throws MessagingException {
//        if (StringUtils.isNoneBlank(this.clientId, this.clientSecret, this.scope, this.authority)) {
//            try {
//                final StringBuilder passwordBuilder = new StringBuilder();
//                passwordBuilder.append("user=").append(this.username)
//                        .append('\u0001')
//                        .append("auth=").append("Bearer ").append(getToken().accessToken())
//                        .append('\u0001').append('\u0001');
//
//                final String base64Password = Base64.getEncoder().encodeToString(passwordBuilder.toString().getBytes(StandardCharsets.UTF_8));
//
//                ((JavaMailSenderImpl) this.emailSender).setPassword(base64Password);
//            } catch (final MalformedURLException e) {
//                throw new MessagingException("Impossible d'initialiser la connexion OAuth2", e);
//            }
//        }
//        this.emailSender.send(message);
//    }
//}