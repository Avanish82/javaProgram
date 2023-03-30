package com.restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.restapi.service.UserDetailsServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
// 
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new UserDetailsServiceImpl();
//    }
//     
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//     
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(userDetailsService());
//        authProvider.setPasswordEncoder(passwordEncoder());
//         
//        return authProvider;
//    }
// 
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider());
//    }
// 
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//            .antMatchers("/").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
//            .antMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
//            .antMatchers("/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
//            .antMatchers("/delete/**").hasAuthority("ADMIN")
//           // .authorizeRequests()
//            .antMatchers("/api/auth/**").permitAll()
//            .antMatchers("/api/test/**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin().permitAll()
//            .and()
//            .logout().permitAll()
//            .and()
//            .exceptionHandling().accessDeniedPage("/403")
//            ;
//    }
//}
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter;
//import org.springframework.security.web.header.writers.StaticHeadersWriter;
//
//import com.restapi.filter.JwtTokenFilter;
//import com.restapi.filter.JwtTokenProvider;
//
// 
//
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Configuration
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
////    private JwtTokenProvider jwtTokenProvider;
////
////    @Autowired
////    public void setJwtTokenProvider(JwtTokenProvider jwtTokenProvider) {
////        this.jwtTokenProvider = jwtTokenProvider;
////    }
//
//    @Bean
//    public AuthenticationManager getAuthenticationManager() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.eraseCredentials(UsernamePasswordAuthenticationToken(userDetailsService.loadUserByUsername(username)))
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
////    @Override
////    public void configure(HttpSecurity http) throws Exception {
////        http.cors().and().authorizeRequests().anyRequest().authenticated().and()
////                .addFilterBefore(new JwtTokenFilter(jwtTokenProvider), WebAsyncManagerIntegrationFilter.class)
////                .headers().addHeaderWriter(new StaticHeadersWriter("X-Content-Security-Policy","script-src 'self'"))
////                .cacheControl()
////                .and().contentTypeOptions().and().httpStrictTransportSecurity().and().frameOptions().and().xssProtection();
////    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/h2-console/").antMatchers("/h2-console/**");
//    }
//}
import org.springframework.security.crypto.password.PasswordEncoder;

import com.restapi.entity.LoginRequest;
import com.restapi.repository.UserRepository;

////working
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserRepository userRepo;
	
    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Bean(name = "authenticationManager")
     

    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    
    
    
//working fine 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
   
    	//auth.jdbcAuthentication().withUser(userRepo.existsByUsername(username));
 //working fine      
        auth.inMemoryAuthentication().withUser("user").password(passwordEncoder.encode("secret")).roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder.encode("admin")).roles("ADMIN");
    }
     
   
	
    @Bean
    PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
     
    }
}

 
 