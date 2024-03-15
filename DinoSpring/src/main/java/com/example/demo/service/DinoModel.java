package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dinosaur;

import java.util.List;


@Service
public class DinoModel {
    private DinosaurService dinosaurService;

    @Autowired
    public void DinosaurModel(DinosaurService dinosaurService) {
        this.dinosaurService = dinosaurService;
    }

    public List<Dinosaur> getAllDinosaurs() {
        return dinosaurService.getAllDinosaurs();
    }

    public List<Dinosaur> getDinosaursBySpecies(String species) {
        return dinosaurService.getDinosaursBySpecies(species);
    }

    public List<Dinosaur> findDinosaurByName(String name) {
        return dinosaurService.findDinosaurByName(name);
    }
}
