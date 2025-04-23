package com.dk.userService.Service.Exception;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException() {
        super("Resource Not Found Exception user not exist");
    }
     public ResourceNotFoundException(String message) {
        super(message);
    }

}
