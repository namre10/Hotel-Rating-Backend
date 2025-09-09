package com.lcwd.user.service.Hotel_Rating.repositories;

import com.lcwd.user.service.Hotel_Rating.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
