package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.session.SessionManagementFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	@Qualifier("myDBAuthenticationService")
//	private MyDBAuthenticationService myDBAauthenticationService;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public CorsFilter corsFilter() {
		List<String> allowedOrigin = new ArrayList<String>();
		allowedOrigin.add("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(allowedOrigin);
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.cors();
		http.csrf().disable();

		http.authorizeRequests().antMatchers("/orderList", "/order", "/accountInfo")
				.access("hasAnyRole('EMPLOYEE', 'MANAGER')");

		http.authorizeRequests().antMatchers("/product").access("hasRole('MANAGER')");

		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		//http.authorizeRequests().anyRequest().authenticated().and().httpBasic();

	}

//	@Autowired
//	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(myDBAauthenticationService).passwordEncoder(bCryptPasswordEncoder());
//	}

}
