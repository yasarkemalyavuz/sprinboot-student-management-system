package com.yasarkemalyavuz.sprinbootstudentmanagementsystem.service;

import com.yasarkemalyavuz.sprinbootstudentmanagementsystem.entity.Student;
import com.yasarkemalyavuz.sprinbootstudentmanagementsystem.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository iStudentRepository;

    public void saveStudent(Student student){
        iStudentRepository.save(student);
    }

    public void deleteStudent(Student student){
        iStudentRepository.delete(student);
    }

    public void findStudent(Integer id){
        iStudentRepository.findById(id);
    }
}
