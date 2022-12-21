package com.example.springjee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitsController {

    @GetMapping("/produits")
    public String displayHome(){
        return "produits";
    }
}
