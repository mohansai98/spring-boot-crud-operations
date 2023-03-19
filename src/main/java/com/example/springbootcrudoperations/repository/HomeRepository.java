package com.example.springbootcrudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrudoperations.model.Model;

public interface HomeRepository extends JpaRepository<Model, Integer> {
    
}
