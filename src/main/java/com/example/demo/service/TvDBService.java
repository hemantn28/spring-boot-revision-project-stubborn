package com.example.demo.service;

import com.example.demo.model.Tv;
import com.example.demo.repository.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class TvDBService {

    @Autowired
    TvRepository tvRepository;


    public String add(Tv tv){
        tvRepository.save(tv);
        return "tv added to db";
    }


    public List<Tv> getAll(){
        return tvRepository.findAll();
    }


    public String update(@PathVariable String name,@PathVariable Integer id){
        Tv tv=tvRepository.getById(id);
        tv.setName("Apple");
        tvRepository.save(tv);
        return "tv updated in db";
    }


    public String delete(@PathVariable Integer id){
        tvRepository.deleteById(id);
        return "tv deleted in db";
    }
}
