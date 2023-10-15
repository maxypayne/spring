//package com.maxim.api.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfiguration {
////    @Bean
////    public InMemoryUserDetailsManager userDetailsManager() {
////        UserDetails maxim = User.builder()
////                .username("Maxim")
////                .password("{noop}test123")
////                .roles("EMPLOYEE")
////                .build();
////
////        UserDetails mary = User.builder()
////                .username("Mary")
////                .password("{noop}test123")
////                .roles("EMPLOYEE", "MANAGER")
////                .build();
////
////        UserDetails ana = User.builder()
////                .username("Ana")
////                .password("{noop}test123")
////                .roles("EMPLOYEE", "MANAGER", "ADMIN")
////                .build();
////        return new InMemoryUserDetailsManager(maxim, mary, ana);
////    };
//    @Bean
//    public UserDetailsManager userDetailsManager(DataSource dataSource) {
//        System.out.println("dataSource" + dataSource.toString());
//        return new JdbcUserDetailsManager(dataSource);
//    }
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(requests ->
//            requests.requestMatchers(HttpMethod.GET, "/students").hasRole("ADMIN")
//        );
//        http.httpBasic(Customizer.withDefaults());
//        http.csrf(AbstractHttpConfigurer::disable);
//        return http.build();
//    }
//}
