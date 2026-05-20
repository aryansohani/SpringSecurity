package com.aryan.springsecuritycofigurations;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.server.servlet.Session;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentlist= new ArrayList<>( List.of (
            new Student(1, "Aryan"),
            new Student(2, "Rahul")
    ));

    @GetMapping("/getCSRF")
    public CsrfToken gettoken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/student")
    public List<Student> getting()
    {
        return studentlist;
    }

    @PostMapping("/student")
    public void addstudent(@RequestBody Student s)
    {
        studentlist.add(s);

        System.out.println("Studentadded");
    }

    @GetMapping("/session")
    public String sessionid(HttpServletRequest request)
    {
       return request.getSession().getId();
    }




}
