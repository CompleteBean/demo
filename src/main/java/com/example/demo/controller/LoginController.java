package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
RestAPI를 만들기 위한 rest컨트롤러가 있고
View를 만들기 위한 컨트롤러가 있다.
post같은 경우에는 post를 안쓰고 body만 쓴다 보통
* */
@RestController
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/loginProc")
    public LoginResponse login(@RequestBody LoginRequest request){
        if(loginService.login(request))
            return new LoginResponse("0000",  "로그인에 성공"); //java객체라서 괜찮
        else{
            return new LoginResponse("9999",  "로그인에 실패"); //java객체라서 괜찮
        }
    }

}
