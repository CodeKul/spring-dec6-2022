package com.codekul.springdec6.onetoone.controller;

import com.codekul.springdec6.onetoone.entity.Aadhar;
import com.codekul.springdec6.onetoone.entity.Person;
import com.codekul.springdec6.onetoone.repository.AadharRepository;
import com.codekul.springdec6.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;

    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person) {
//       Person person1 = new Person();
//       person1.setAge(10);
//       person1.setName("Prakash");
//
//       Aadhar aadhar = new Aadhar();
//       aadhar.setAadharNumber(242343222L);
//       aadhar.setNationality("Indian");
//
//       person1.setAadhar(aadhar);
//       aadhar.setPerson(person1);
//
//       personRepository.save(person1);
//       aadharRepository.save(aadhar);
        personRepository.save(person);
       return "person and adhar saved";

    }

//    @PostMapping("saveAadhar")
//    public String saveAadhar(@RequestBody Aadhar aadhar) {
//        aadharRepository.save(aadhar);
//        return "aadhar saved..";
//    }
}
