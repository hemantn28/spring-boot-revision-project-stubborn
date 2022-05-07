package com.example.demo.controller;

import com.example.demo.service.CollegeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeDBController {


    @Autowired
    CollegeDBService service;

    @RequestMapping(value = "add_college_db", method = RequestMethod.POST)
    public String add(@RequestBody College college){
        return service.add(college);
    }

    @RequestMapping(value = "get_college_db", method = RequestMethod.GET)
    public List<College> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "update_college_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @PathVariable Integer id) {
        service.update("Hindustan College",243);
        return "college updated in db";

    }

    @RequestMapping(value = "college_deleted_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(243);
        return "college deleted in db";
    }


    }
