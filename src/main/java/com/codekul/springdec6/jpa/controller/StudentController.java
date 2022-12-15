package com.codekul.springdec6.jpa.controller;

import com.codekul.springdec6.jpa.entity.Student;
import com.codekul.springdec6.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student saved..";
    }
    @GetMapping("getStudent")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }


}
