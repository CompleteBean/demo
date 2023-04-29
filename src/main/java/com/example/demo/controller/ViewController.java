package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
/*
http://localhost:8080/index?name=KWB
*/


@Controller
public class ViewController {
    private final LoginService loginService;

    public ViewController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public ModelAndView index(String name){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("name", (name == null)? "사용자" : name);
        return mav;
    }
    @GetMapping("/login")
    /*GetMapping은 각각의 접속이 개별 쓰레드로 되어 있어 데이터충돌이나 겹침이 발생하지 않음*/
    /*KEY -VALUE 키가 세션이다 jvm의 메모리 내에 저장되어 있는 값의 구조임*/
    /*스프링 시큐리티의 내용인데 CSRF Token이 세션의 탈취를 막아준다*/
    public ModelAndView loginProc(String email, String password){
        ModelAndView mav = new ModelAndView();

        /*
          http://localhost:8080/index?name=KWB
          http://localhost:8080/login?email=email&password=password
        */
        if(email == null || password == null){
            mav.setViewName("redirect:/index");
        }
        else if(loginService.login(new LoginRequest(email, password))){
            mav.setViewName("forward:/index?name=" + email);
        }
        else{
            mav.setViewName("index");
            mav.addObject("loginDeny", true);
        }

        return mav;
    }
}