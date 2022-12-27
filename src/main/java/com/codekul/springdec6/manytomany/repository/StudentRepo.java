package com.codekul.springdec6.manytomany.repository;

import com.codekul.springdec6.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
