package com.example.demo.controller;

import com.example.demo.model.Tv;
import com.example.demo.service.TvDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TvDBController {

    @Autowired
    TvDBService tvDBService;

    @RequestMapping(value = "add_tv_db", method = RequestMethod.POST)
    public String add(@RequestBody Tv tv){
        return tvDBService.add(tv);
    }

    @RequestMapping(value = "get_tv_db", method = RequestMethod.GET)
    public List<Tv> getAll(){
        return tvDBService.getAll();
    }

    @RequestMapping(value = "update_tv_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name,@PathVariable Integer id){
        tvDBService.update("Apple",234);
        return "tv updated in db";
    }

    @RequestMapping(value = "delete_tv_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        tvDBService.delete(231);
        return "tv deleted in db";
    }

}
