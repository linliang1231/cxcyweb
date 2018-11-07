package com.news.cxcyweb.service.impl;


import com.news.cxcyweb.mapper.StudentMapper;
import com.news.cxcyweb.model.Student;
import com.news.cxcyweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAllStudent();
    }
}