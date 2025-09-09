package com.lcwd.user.service.Hotel_Rating.exceptions;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource Not Found On Server!!");
    }

    public ResourceNotFoundException(String message){
        super("message");
    }
}
