package com.example.demo.controller;

import com.example.demo.model.Actress;
import com.example.demo.service.ActressDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActressDBController {

    @Autowired
    ActressDBService service;

    @RequestMapping(value = "add_actress_db", method = RequestMethod.POST)
    public String add(@RequestBody Actress actress){

        return service.add(actress);
    }

    @RequestMapping(value = "get_actress_db", method = RequestMethod.GET)
    public List<Actress> getAll(){

        return service.getAll();
    }

    @RequestMapping(value = "update_actress_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        service.update("Soha ALi Khan",225);
        return "actress updated in db";
    }

    @RequestMapping(value = "actress_deleted_db", method = RequestMethod.DELETE)
    public String delete(Integer id){
        service.delete(225);
        return "actress deleted in db";
    }
}
