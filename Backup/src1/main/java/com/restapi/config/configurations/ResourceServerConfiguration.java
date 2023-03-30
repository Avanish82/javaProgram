package com.icicihfc.services.security.configurations;

import com.icicihfc.services.security.openapi.JwtTokenFilter;
import com.icicihfc.services.security.openapi.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

/**
 * @author rajatjain on 16/01/20.
 * @project oauth2boiler
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private static final String FD_PORTAL_KYC_PREFIX = "/fd/application/form/offline/kyc";
    private static final String FD_BROKER_PREFIX = "/broker/application";
    private static final String FD_BROKER_DASHBOARD_PREFIX = "/broker/dashboard";
    private static final String FD_PORTAL_PREFIX = "/fd/application/form";
    private static final String FD_PORTAL_CUSTOMER_DETAILS = FD_PORTAL_PREFIX + "/customer/details";
    private static final String RESOLUTION_DASHBOARD_PREFIX = "/resolution/dashboard";

    private static final String DMA_RP_FORM_PREFIX = "/dma/rp/form";

    private static final String PAYMENT_GATEWAY_PREFIX = "/payment";

    private static final String CUSTOMER_DETAILS_PREFIX = "/customer";

    private static final String ESIGN_PREFIX = "/esign";

    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    public void setJwtTokenProvider(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.cors().and()
                //MISC
                .authorizeRequests()
                .antMatchers("/employee/services/**",
                        "/emailer/**",
                        "/test",
                        "/document/reference/fetch/**",
                        "/customer/dashboard/get/finacle/cities",
                        "/gdpr/submit/data",
                        "/campaign/form/**")
                .permitAll()
                .and()

                // Resolution Framework
                .authorizeRequests()
                .antMatchers(
                        "/resolution/branch/**",
                        "/resolution/application/download/resolution/web/application/excel",
                        "/resolution/application/download/resolution/application/excel",
                        "/resolution/download/resolution/application/pdf",
                        "/resolution/application/download/resolution/web/application/pdf",
                        "/resolution/application/save/data",
                        "/resolution/application/generate/otp",
                        "/resolution/application/verify/otp",
                        "/resolution/application/web/send/internal/mails",
                        "/resolution/send/bulk/emailer",
                        RESOLUTION_DASHBOARD_PREFIX + "/upload/classification/matrix/excel" ).permitAll()
                .and()

                //EMPLOYEE Module
                .authorizeRequests()
                .antMatchers(
                        "/logmeout",
                        "/employee/login/**",
                        "/employee/forgot/password",
                        "/employee/forgot/password/verify/otp").permitAll()
                .and()

                //FD Portal Module
                .authorizeRequests()
                .antMatchers(
                        "/fd/interest/rates/**",
                        "/fd/referral/**",
                        "/fd/city/state/**",
                        "/offline/kyc/upload/adhaar",
                        "/offline/kyc/upload/adhaar/with/esign",
                        "/offline/kyc/fetch/image/by/kycId/**",
                        "/pincode/**",
                        FD_PORTAL_KYC_PREFIX + "/create/with/kycId",
                        FD_PORTAL_KYC_PREFIX + "/check/kycId",
                        FD_PORTAL_CUSTOMER_DETAILS + "/create/with/customer/id",
                        FD_PORTAL_CUSTOMER_DETAILS + "/check/customer/id",
                        FD_PORTAL_PREFIX + "/create",
                        FD_PORTAL_PREFIX + "/resume/application",
                        FD_PORTAL_PREFIX + "/resume/application/verify/otp",
                        FD_PORTAL_PREFIX + "/forgot/application/id",
                        FD_PORTAL_PREFIX + "/forgot/application/id/verify/otp",
                        FD_PORTAL_PREFIX + "/excel/email/test/partial/2",
                        FD_PORTAL_PREFIX + "/excel/email/test/partial",
                        FD_PORTAL_PREFIX + "/forgot/thirty/min/emails",
                        FD_PORTAL_PREFIX + "/calculate/fd/maturity").permitAll()
                .and()

                //FD Broker Module
                .authorizeRequests()
                .antMatchers(
                        FD_BROKER_PREFIX + "/create/with/kyc/id",
                        FD_BROKER_PREFIX + "/resume/application",
                        FD_BROKER_PREFIX + "/resume/application/verify/otp",
                        FD_BROKER_PREFIX + "/forgot/application/id",
                        FD_BROKER_PREFIX + "/forgot/application/id/verify/otp",
                        FD_BROKER_DASHBOARD_PREFIX + "/download/broker/application/form/excel",
                        FD_BROKER_DASHBOARD_PREFIX + "/download/broker/application/form/pdf").permitAll()
                .and()

                //Payment Gateway Module
                .authorizeRequests()
                .antMatchers(
                        PAYMENT_GATEWAY_PREFIX + "/complete/pg",
                        PAYMENT_GATEWAY_PREFIX + "/complete",
                        PAYMENT_GATEWAY_PREFIX + "/complete/bill/desk",
                        PAYMENT_GATEWAY_PREFIX + "/complete/bill/desk/get",
                        PAYMENT_GATEWAY_PREFIX + "/get/default/payment/gateway",
                        PAYMENT_GATEWAY_PREFIX + "/get/bank/names").permitAll()
                .and()

                //DMA RP Form
                .authorizeRequests()
                .antMatchers(
                        DMA_RP_FORM_PREFIX + "/create",
                        DMA_RP_FORM_PREFIX + "/resume/application",
                        DMA_RP_FORM_PREFIX + "/resume/application/verify/otp",
                        DMA_RP_FORM_PREFIX + "/forgot/application/id",
                        DMA_RP_FORM_PREFIX + "/forgot/application/id/verify/otp").permitAll()
                .and()

                //Customer Details
                .authorizeRequests()
                .antMatchers(
                        CUSTOMER_DETAILS_PREFIX + "/login/signup",
                        CUSTOMER_DETAILS_PREFIX + "/login/verify/otp").permitAll()
                .and()

                //Esign
                .authorizeRequests()
                .antMatchers(
                        ESIGN_PREFIX + "/handle/response",
                        ESIGN_PREFIX + "/handle/response/aem",
                        ESIGN_PREFIX + "/request").permitAll()
                .and()

                .addFilterBefore(new JwtTokenFilter(jwtTokenProvider), WebAsyncManagerIntegrationFilter.class)
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .headers().addHeaderWriter(new StaticHeadersWriter("X-Content-Security-Policy", "script-src 'self'"))
                .cacheControl()
                .and().contentTypeOptions().and().httpStrictTransportSecurity().and().frameOptions().and().xssProtection();
    }
}
