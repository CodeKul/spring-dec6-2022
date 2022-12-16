package com.codekul.springdec6.jpa.controller;

import com.codekul.springdec6.jpa.entity.Student;
import com.codekul.springdec6.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student saved..";
    }
    @PostMapping("saveStudents")
    public String saveStudent(@RequestBody List<Student> students){
        studentRepository.saveAll(students);
        return "students saved..";
    }
    @GetMapping("getStudent")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

//
//    @GetMapping("getById/{id}")
//    public Optional<Student> getStudentById(@PathVariable Integer id){
//        return studentRepository.findById(id);
//    }
//    @GetMapping("getById/{id}")
//    public Student getStudentById(@PathVariable Integer id){
//        return studentRepository.getReferenceById(id);
//    }
//    @GetMapping("getById/{id}")
//    public Student getStudentById(@PathVariable Integer id){
//        return studentRepository.getById(id);
//    }

    @PutMapping("update")
    public String updateStudent(@RequestBody Student student){
        Student student1= studentRepository.getReferenceById(student.getId());
        student1.setAddress(student.getAddress());
        student1.setName(student.getName());
        student1.setMobileNumber(student.getMobileNumber());

        studentRepository.save(student1);
        return "record Updated";
    }


//    @DeleteMapping("delete/{id}")
//    public String deleteStudent(@PathVariable("id") Integer id){
//        studentRepository.deleteById(id);
//        return "record deleted";
//    }

    @DeleteMapping("deleteByIds/{id}")
    public String deleteStudent(@PathVariable("id") List<Integer> id){
        studentRepository.deleteAllById(id);
        return "records deleted";
    }


}
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/