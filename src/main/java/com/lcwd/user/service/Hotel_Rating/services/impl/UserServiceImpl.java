package com.lcwd.user.service.Hotel_Rating.services.impl;

import com.lcwd.user.service.Hotel_Rating.entities.User;
import com.lcwd.user.service.Hotel_Rating.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.Hotel_Rating.repositories.UserRepository;
import com.lcwd.user.service.Hotel_Rating.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException());
    }
}
