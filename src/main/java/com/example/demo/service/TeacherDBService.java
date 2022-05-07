package com.example.demo.service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class TeacherDBService {

    @Autowired
    TeacherRepository repository;

    public String add(Teacher teacher){
        repository.save(teacher);
        return "teacher added to db";
    }


    public List<Teacher> getAll(){
        return  repository.findAll();
    }


    public String update(@PathVariable String name,@PathVariable Integer id){
        Teacher teacher=repository.getById(id);
        teacher.setName("LN Ojha");
        repository.save(teacher);
        return "teacher updated in db";
    }


    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "teacher deleted in db";
    }
}
