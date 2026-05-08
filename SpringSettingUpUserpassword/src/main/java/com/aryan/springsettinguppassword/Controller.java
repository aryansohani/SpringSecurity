package com.aryan.springsettinguppassword;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home(HttpServletRequest req)
    {
        return "home"+ req.getSession().getId();
    }

    @GetMapping("/about")
    public String about(HttpServletRequest req)
    {
        return "about"+ req.getSession().getId();
    }


}
