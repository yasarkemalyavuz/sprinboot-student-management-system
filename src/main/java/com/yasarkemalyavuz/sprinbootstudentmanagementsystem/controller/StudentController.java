package com.yasarkemalyavuz.sprinbootstudentmanagementsystem.controller;

import com.yasarkemalyavuz.sprinbootstudentmanagementsystem.entity.Student;
import com.yasarkemalyavuz.sprinbootstudentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @PostMapping("/save")
    public void kaydet (@RequestBody Student student){

        studentService.saveStudent(student);
    }

}
