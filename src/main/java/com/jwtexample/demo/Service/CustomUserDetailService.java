package com.jwtexample.demo.Service;

import com.jwtexample.demo.Repositories.UserRepository;
import com.jwtexample.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //load user  from database

        User user =userRepository.findByEmail(email).orElseThrow(()->new RuntimeException("user not found "));
        return user;
    }
}
