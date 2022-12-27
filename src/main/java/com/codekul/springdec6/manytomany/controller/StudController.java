package com.codekul.springdec6.manytomany.controller;

import com.codekul.springdec6.manytomany.entity.Courses;
import com.codekul.springdec6.manytomany.entity.Student;
import com.codekul.springdec6.manytomany.repository.CoursesRepository;
import com.codekul.springdec6.manytomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CoursesRepository coursesRepository;

    @PostMapping("saveStud")
    public String saveStud(@RequestBody Student student) {
        studentRepo.save(student);
        return "saved..";
    }

    @PostMapping("saveCourses")
    public String saveCourse(@RequestBody Courses courses) {
        coursesRepository.save(courses);
        return "saved..";
    }


}
