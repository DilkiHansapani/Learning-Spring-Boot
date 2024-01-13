package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//This is the business logic
@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("Dilki");
        boolean isValidPassword = password.equalsIgnoreCase("3213735");
        return isValidUsername && isValidPassword;
    }
}
