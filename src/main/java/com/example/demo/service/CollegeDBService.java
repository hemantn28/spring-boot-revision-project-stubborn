package com.example.demo.service;

import com.example.demo.controller.College;
import com.example.demo.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CollegeDBService {

    @Autowired
    CollegeRepository repository;

    public String add(College college){
        repository.save(college);
        return "college added to db";
    }


    public List<College> getAll(){
        return repository.findAll();
    }


    public String update(@PathVariable String name, @PathVariable Integer id){
        College college=repository.getById(id);
        college.setName("Hindustan College");
        repository.save(college);
        return "college updated in db";
    }


    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "college deleted in db";
    }


}
