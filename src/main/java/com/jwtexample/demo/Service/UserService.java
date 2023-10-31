package com.jwtexample.demo.Service;

import com.jwtexample.demo.Repositories.UserRepository;
import com.jwtexample.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

//    private List<User> store = new ArrayList<>();

//    public UserService()
//    {
//        store.add(new User(UUID.randomUUID().toString(),"dhun","dhun@gmail.com"));
//        store.add(new User(UUID.randomUUID().toString(),"chinmoy","chinmoy@gmail.com"));
//        store.add(new User(UUID.randomUUID().toString(),"keshab","keshab@gmail.com"));
//    }
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getUsers()
    {
        return this.userRepository.findAll();
    }

    public User createUser(User user)
    {
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
