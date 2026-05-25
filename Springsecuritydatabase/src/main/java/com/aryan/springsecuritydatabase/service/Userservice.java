package com.aryan.springsecuritydatabase.service;

import com.aryan.springsecuritydatabase.model.User;
import com.aryan.springsecuritydatabase.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Userservice implements UserDetailsService {

    @Autowired
    public Repo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user==null)
        {
            System.out.println("404 error");
            throw new UsernameNotFoundException("404- user not found");
        }
        return new Userprincipal(user);
    }
}
