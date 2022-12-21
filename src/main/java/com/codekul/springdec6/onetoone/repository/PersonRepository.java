package com.codekul.springdec6.onetoone.repository;

import com.codekul.springdec6.onetoone.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
