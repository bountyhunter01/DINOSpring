// DinosaurController.java
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dinosaur;
import com.example.demo.service.DinoModel;

import java.util.List;

@Controller
@RequestMapping("/dinosaur")
public class DinoController {

    private final DinoModel dinoModel;

    @Autowired
    public DinoController(DinoModel dinoModel) {
        this.dinoModel = dinoModel;
    }

    @GetMapping("/")
    public List<Dinosaur> getAllDinosaurs() {
        return dinoModel.getAllDinosaurs();
    }

    @GetMapping("/species")
    public List<Dinosaur> getDinosaursBySpecies(@RequestParam String species) {
        return dinoModel.getDinosaursBySpecies(species);
    }

    @GetMapping("/name")
    public List<Dinosaur> findDinosaurByName(@RequestParam String name) {
        return dinoModel.findDinosaurByName(name);
    }
}

