package com.example.demo.controller;

import com.example.demo.model.Actor;
import com.example.demo.service.ActorDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorDBController {

    @Autowired
    ActorDBService service;

    @RequestMapping(value = "add_actor_db", method = RequestMethod.POST)
    public String add(@RequestBody Actor actor){
        return service.add(actor);
    }

    @RequestMapping(value="get_actor_db", method = RequestMethod.GET)
    public List<Actor> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "update_actor_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        service.update("vinod Khanna", 205);
        return "actor updated in db";
    }

    @RequestMapping(value= "delete_actor_db")
    public String delete(Integer id){
        service.delete(203);
        return "actor deleted in db";
    }




}
