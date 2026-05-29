package com.aryan.springsecuritydatabase.Controller;

import com.aryan.springsecuritydatabase.model.User;
import com.aryan.springsecuritydatabase.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService registering;

    @PostMapping("register")
    public User registeruser(@RequestBody User user)
    {
        return  registering.registeruser(user);
    }

    @GetMapping("getuser")
    public List<User> getuser()
    {
        return registering.getalluser();
    }


}
