package com.maxim.api.security;

import com.maxim.api.entities.Role;
import com.maxim.api.entities.UserEntity;
import com.maxim.api.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {
    UserRepository userRepository;
    CustomUserDetailsService(UserRepository repo) {
        userRepository = repo;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new User(user.getUsername(), user.getPassword(), user.roles());
    };
    Collection <GrantedAuthority> mapRolesToAuthority(List<Role> roles) {
//        return roles.stream();
        return null;
    };
}
