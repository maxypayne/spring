package com.maxim.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
//                .antMatchers(HttpMethod.GET).permiteAll().hasRole()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

        return http.build();
    }
    @Bean
    public UserDetailsService users() {
        UserDetails max = User
                .builder()
                .username("max")
                .password("123")
                .roles("ADMIN")
                .build();
        UserDetails ana = User
                .builder()
                .username("ana")
                .password("123")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(max, ana);
    }
}
