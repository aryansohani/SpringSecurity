

package com.aryan.springsecuritydatabase.repository;

import com.aryan.springsecuritydatabase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}