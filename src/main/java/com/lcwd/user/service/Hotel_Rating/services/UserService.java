package com.lcwd.user.service.Hotel_Rating.services;

import com.lcwd.user.service.Hotel_Rating.entities.User;

import java.util.List;

public interface UserService {

    //User Operations

    //create
    User saveUser(User user);

    //get all User
    List<User> getAllUser();

    //get Single User
    User getUser(String userId);


}
