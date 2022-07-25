package com.prabodha.rentcar.demoapplication.controller;


import com.prabodha.rentcar.demoapplication.model.Student;
import com.prabodha.rentcar.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String greetings(){
        return "Hello Get SpringBoot";
    }
    @RequestMapping(value = "/hello" , method = RequestMethod.POST)
    public String greetings2(){
        return "Hello  Post SpringBoot";
    }

    @RequestMapping(value = "/student" , method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "/student" , method = RequestMethod.GET)
   public ResponseEntity<Student>  fetchStudent(@RequestParam int id){
        Student student = studentService.fetchStudentById(id);
        if(student==null){
         return ResponseEntity.notFound().build();
        }else {
          return ResponseEntity.ok().body(student);
        }
   }
}



