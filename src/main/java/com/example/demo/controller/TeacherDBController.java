package com.example.demo.controller;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherDBController {


    @Autowired
    TeacherDBService service;

    @RequestMapping(value = "add_teacher_db", method = RequestMethod.POST)
    public String add(@RequestBody Teacher teacher){
        return service.add(teacher);
    }

    @RequestMapping(value = "get_teacher_db", method = RequestMethod.GET)
    public List<Teacher> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "teacher_updated_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @PathVariable Integer id){
        service.update("LN Ojha",235);
        return "teacher updated in db";
    }

    @RequestMapping(value= "delete_teacher_db", method = RequestMethod.DELETE)
    public String update(@RequestParam Integer id){
        service.delete(235);
        return "teacher deleted in db";
    }
}
