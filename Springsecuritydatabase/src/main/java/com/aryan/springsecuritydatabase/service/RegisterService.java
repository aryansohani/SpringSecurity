package com.aryan.springsecuritydatabase.service;


import com.aryan.springsecuritydatabase.model.User;
import com.aryan.springsecuritydatabase.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private Repo repo;


    private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(12);

    public User registeruser(User user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
       return repo.save(user);
    }

    public List<User> getalluser()
    {
        return repo.findAll();
    }




}
