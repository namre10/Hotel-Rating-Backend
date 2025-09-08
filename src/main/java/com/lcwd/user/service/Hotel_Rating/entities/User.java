package com.lcwd.user.service.Hotel_Rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="micro_users")
public class User {

    @Id
    @Column(name="Id")
    private String userId;

    @Column(name="Name")
    private String name;

    @Column(name="Email")
    private String email;

    @Column(name="About")
    private String about;
    //other user properties can be added
}
