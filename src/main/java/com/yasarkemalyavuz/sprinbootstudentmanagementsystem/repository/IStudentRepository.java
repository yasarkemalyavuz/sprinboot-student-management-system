package com.yasarkemalyavuz.sprinbootstudentmanagementsystem.repository;

import com.yasarkemalyavuz.sprinbootstudentmanagementsystem.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {
}
