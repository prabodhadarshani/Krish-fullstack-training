package com.prabodha.rentcar.demoapplication.service;

import com.prabodha.rentcar.demoapplication.Repository.StudentRepository;
import com.prabodha.rentcar.demoapplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
     StudentRepository studentRepository;

   public Student save(Student student){
     return studentRepository.save(student);

    }

    public Student fetchStudentById(int id){
        Optional<Student> student =  studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }


}
