package com.codekul.springdec6.manytomany.repository;

import com.codekul.springdec6.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,Integer> {
}
