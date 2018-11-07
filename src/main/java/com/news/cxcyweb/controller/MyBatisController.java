package com.news.cxcyweb.controller;


import com.news.cxcyweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class MyBatisController  {
    @Autowired
    private StudentService studentService;
    @GetMapping("/boot/students")
    public  Object students(){


       // sys
        return studentService.getAllStudent();




    }
}
