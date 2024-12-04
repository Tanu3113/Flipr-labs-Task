package com.fliprlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fliprlabs.model.Subscriber;
import com.fliprlabs.repository.SubscriberRepository;

@Service
public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Subscriber subscriber = subscriberRepository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("Subscriber not found with email: " + email));
        
        // You can assign roles or authorities if needed. Here, just granting ROLE_USER.
        return User.builder()
                .username(subscriber.getEmail())
                .password(subscriber.getPassword())
                .roles("ADMIN")  // you can add roles if needed
                .build();
    }
}
