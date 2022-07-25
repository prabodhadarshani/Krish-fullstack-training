package com.prabodha.rentcar.demoapplication.service;


import com.prabodha.rentcar.demoapplication.model.Student;
import org.springframework.data.repository.Repository;

public interface StudentService extends Repository<Student, Integer> {

   Student save(Student student);


   Student fetchStudentById(int id);
}
