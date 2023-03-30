package com.restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import org.springframework.security.crypto.password.PasswordEncoder;
import com.restapi.repository.UserRepository;

////working
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserRepository userRepo;
	
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean(name = "authenticationManager")
     

    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
   // @Qualifier("userDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;

//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
    
    
//working fine 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
 //working fine      
//        auth.inMemoryAuthentication().withUser("user").password(passwordEncoder.encode("secret")).roles("USER");
//        auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder.encode("admin")).roles("ADMIN");
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
     
    private PasswordEncoder bCryptPasswordEncoder() {
	// TODO Auto-generated method stub
    	return new BCryptPasswordEncoder();
}
	
    @Bean
    PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
     
    }
    
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//      http.authorizeRequests()
//          .antMatchers("/").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
//          .antMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
//          .antMatchers("/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
//          .antMatchers("/delete/**").hasAuthority("ADMIN")
//         // .authorizeRequests()
//          .antMatchers("/api/auth/**").permitAll()
//          .antMatchers("/api/test/**").permitAll()
//          .anyRequest().authenticated()
//          .and()
//          .formLogin().permitAll()
//          .and()
//          .logout().permitAll()
//          .and()
//          .exceptionHandling().accessDeniedPage("/403")
//          ;
//  }
//}
//
}

 
 