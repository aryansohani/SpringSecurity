package com.aryan.springsecurity.Contoller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String greet(HttpServletRequest request)
    {
        return "hello world"+ request.getSession().getId();
    }
    @GetMapping("/About")
    public String about(HttpServletRequest request)
    {
        return "hello welcome aryan"+ request.getSession().getId();
    }



}
