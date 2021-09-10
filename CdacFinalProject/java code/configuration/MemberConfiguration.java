package com.sports.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.sports.services.MemberDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class MemberConfiguration extends WebSecurityConfigurerAdapter {
	/*
	 * @Autowired private UserDetailsService detailsService;
	 */

	@Bean
	public UserDetailsService userDetailsService() {
		return new MemberDetailsServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	AuthenticationProvider authenticationProvider() {

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

		provider.setUserDetailsService(userDetailsService());

		provider.setPasswordEncoder(passwordEncoder());

		return provider;

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				.antMatchers("/css/**", "/img/**", "/", "/js/**", "/register", "/registermember", "/swimming",
						"/cricket", "/badminton", "/bodyzone", "/music","/contact","/gallery",
						"/login/**")
				.permitAll()
				
				.antMatchers("/newtournament").hasAuthority("admin")
				.antMatchers("/addtournament").hasAuthority("admin")
				.antMatchers("/updateForm/**").hasAuthority("admin")
				.antMatchers("/deleteTournament/**").hasAuthority("admin")
				.antMatchers("/participants").hasAuthority("admin")
				.antMatchers("/addAdmin").hasAuthority("admin")
				
				.anyRequest().authenticated()
				
				
				
				
				.and().formLogin().loginPage("/login")
				.usernameParameter("username").passwordParameter("password").defaultSuccessUrl("/", true)
				.failureUrl("/login?invalid").permitAll().and().logout().invalidateHttpSession(true)
				.clearAuthentication(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/login?loggedout").permitAll();

	}

}
