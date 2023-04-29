package com.example.demo.service;

import com.example.demo.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Value("${user.email}")
    private String email;
    @Value("${user.password}")
    private String password;

    public boolean login(LoginRequest loginRequest){
        return loginRequest.getEmail().equals(email) && loginRequest.getPassword().equals(password);
    }

}
