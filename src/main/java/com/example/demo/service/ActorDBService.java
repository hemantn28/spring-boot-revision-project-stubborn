package com.example.demo.service;

import com.example.demo.model.Actor;
import com.example.demo.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ActorDBService {

    @Autowired
    ActorRepository repository;

    @RequestMapping(value = "add_actor_db", method = RequestMethod.POST)
    public String add(Actor actor){
        repository.save(actor);
        return "actor added to db";
    }

    public List<Actor> getAll(){
        return repository.findAll();
    }


    public String update(@RequestParam String name, @RequestParam Integer id){
        Actor actor=repository.getById(id);
        actor.setName("vinod Khanna");
        repository.save(actor);
        return "actor updated in db";
    }

    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "actor deleted in db";
    }


}