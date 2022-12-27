//package com.codekul.springdec6.jpa.controller;
//
//import com.codekul.springdec6.jpa.entity.Student;
//import com.codekul.springdec6.jpa.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.List;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("saveStudent")
//    public String saveStudent(@RequestBody Student student){
//        Student student1 = new Student();
//        student1.setMobileNumber(student.getMobileNumber());
//        student1.setDob(student.getDob());
//        student1.setName(student.getName());
//        student1.setAddress(student.getAddress());
//        Period period = Period.between(student.getDob(),LocalDate.now());
//        int age = period.getYears();
//        student1.setAge(age);
//        studentRepository.save(student1);
//        return "student saved..";
//    }
//    @PostMapping("saveStudents")
//    public String saveStudent(@RequestBody List<Student> students){
//        studentRepository.saveAll(students);
//        return "students saved..";
//    }
//    @GetMapping("getStudent")
//    public List<Student> getStudent(){
//        return studentRepository.findAll();
//    }
//
////
////    @GetMapping("getById/{id}")
////    public Optional<Student> getStudentById(@PathVariable Integer id){
////        return studentRepository.findById(id);
////    }
////    @GetMapping("getById/{id}")
////    public Student getStudentById(@PathVariable Integer id){
////        return studentRepository.getReferenceById(id);
////    }
////@GetMapping("getById/{id}")
////public Student getStudentById(@PathVariable Integer id) {
////    return studentRepository.getById(id);
////}
//
//    @PutMapping("update")
//    public String updateStudent(@RequestBody Student student) {
//        Student student1 = studentRepository.getReferenceById(student.getId());
//        student1.setAddress(student.getAddress());
//        student1.setName(student.getName());
//        student1.setMobileNumber(student.getMobileNumber());
//
//        studentRepository.save(student1);
//        return "record Updated";
//    }
//
//
////    @DeleteMapping("delete/{id}")
////    public String deleteStudent(@PathVariable("id") Integer id){
////        studentRepository.deleteById(id);
////        return "record deleted";
////    }
//
//    @DeleteMapping("deleteByIds/{id}")
//    public String deleteStudent(@PathVariable("id") List<Integer> id) {
//        studentRepository.deleteAllById(id);
//        return "records deleted";
//    }
//
//    @PostMapping("deleteByObject/{id}")
//    public String deleteStudent(@RequestBody Student student) {
//        studentRepository.delete(student);
//        return "records deleted";
//    }
//
////    @GetMapping("getByAddress/{address}/{name}")
////    public List<Student> getByAddress(@PathVariable("address") String address,
////                                      @PathVariable("name") String name) {
////        return studentRepository.findDistinctByAddressAndName(address, name);
////    }
//
//    @GetMapping("getAddress")
//    public List<String> getAddress() {
//        return studentRepository.findDistinctAddress();
//    }
//
//    @GetMapping("getByAddress/{address}/{name}")
//    public List<Student> getByAddress(@PathVariable("address") String address, @PathVariable("name") String name) {
//        return studentRepository.findByAddressOrName(address, name);
//    }
//
//    @GetMapping("getByName/{name}")
//    public List<Student> findByName(@PathVariable("name") String name) {
//        return studentRepository.findByNameEquals(name);
//    }
//
//    @GetMapping("getStudentByDob/{startDate}/{endDate}")
//    public List<Student> findByName(@PathVariable("startDate") LocalDate startDate, @PathVariable("endDate") LocalDate endDate) {
//        return studentRepository.findByDobBetween(startDate, endDate);
//    }
//
//    @GetMapping("getStudentDobAfter/{startDate}")
//    public List<Student> getStudentDobAfter(@PathVariable("startDate") LocalDate startDate) {
//        return studentRepository.findByDobAfter(startDate);
//    }
//}
//
//
//
////https://docs.spring.io/spring-data/jpa/docs/current/reference/html/