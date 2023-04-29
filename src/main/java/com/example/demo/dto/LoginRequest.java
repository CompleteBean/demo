package com.example.demo.dto;

public class LoginRequest {
    private String email;
    private String password;

    public LoginRequest() {

    }

    public LoginRequest(String email, String pawword) {
        this.email = email;
        this.password = pawword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
