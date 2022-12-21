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
        personRepository.save(person);
        return "person saved..";
    }

    @PostMapping("saveAadhar")
    public String saveAadhar(@RequestBody Aadhar aadhar) {
        aadharRepository.save(aadhar);
        return "aadhar saved..";
    }
}
