package com.example.springbootcrudoperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrudoperations.model.Model;
import com.example.springbootcrudoperations.repository.HomeRepository;

@RestController
public class HomeController {

    @Autowired
    HomeRepository homeRepository;

    @GetMapping("/details")
    public List<Model> getAllData(){
        return homeRepository.findAll();
    }

    @PostMapping("/detail")
    public String saveData(@RequestBody Model data){
        homeRepository.save(data);
        return "Saved";
    }

    @DeleteMapping("detail/{id}")
    public String deleteData(@PathVariable int id){
        Model model = new Model(id, null);
        homeRepository.delete(model);
        return "Deleted";
    }
    
}
