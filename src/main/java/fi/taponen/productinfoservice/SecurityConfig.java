package fi.taponen.productinfoservice;
/*
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
		protected void configure(HttpSecurity http) throws Exception {
		// allow access to all endpoints
		http
		
			.csrf()
			.disable()
			.cors()
			.and()
			.authorizeRequests()
			.anyRequest()
			.permitAll(); 
			
		
			.csrf().disable()
			.authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
        	.anyRequest().authenticated()
        	.and()
        	.httpBasic();
	 }

}*/
