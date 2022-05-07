package com.example.demo.service;

import com.example.demo.model.Actress;
import com.example.demo.repository.ActressDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ActressDBService {

    @Autowired
    ActressDBRepository repository;

    public String add(Actress actress){
        repository.save(actress);
        return "actress added to db";
    }


    public List<Actress> getAll(){

        return repository.findAll();
    }


    public String update(@RequestParam String name,@RequestParam Integer id){
        Actress actress=repository.getById(id);
        actress.setName("Soha ALi Khan");
        repository.save(actress);
        return "actress added to db";
    }

    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "actress deleted in db";
    }
}
