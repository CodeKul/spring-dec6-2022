//package com.codekul.springdec6.jpa.repository;
//
//import com.codekul.springdec6.jpa.entity.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student,Integer> {
//    List<Student> findDistinctByAddressAndName(String address,String name);
//
//    @Query(value = "select distinct address from student",nativeQuery = true)
//    List<String> findDistinctAddress();
//
//    List<Student> findByAddressOrName(String address, String name);
//    List<Student> findByName(String name);
//
//    List<Student> findByNameEquals(String name);
//
//    List<Student> findByDobBetween(LocalDate startDate, LocalDate endDate);
//
//    List<Student> findByDobAfter(LocalDate startDate);
//}
