package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @GetMapping("/all")
    public String getAllCategorie(Model model){
        String printCategories = "";
        List<Categorie> categories = categorieService.getAllCategories();
        for (Categorie categorie : categories ) {
            printCategories += categorie.getId_categorie() +"," + categorie.getNom() + " - ";
        }
        model.addAttribute("categories",printCategories);
        return  "index";
    }

    @GetMapping("/find/{id}")
    public String getCategorieById(@PathVariable Integer id, Model model){
        Optional<Categorie> categorie =categorieService.getCategorieById(id);
        if (categorie.isPresent()) {
            model.addAttribute("categorie","categorie.getNom()");
        }

        return "index";
    }

    @GetMapping("/toto")
    public String afficherToto(Model model){
        model.addAttribute("printToto","tata");
        return "index";
    }

    @RequestMapping("/add/{nom}")
    public String addCategorie(@PathVariable String nom){
        categorieService.addCategorie(nom);
        return  "index";
    }

    @RequestMapping("/index")
    public String displayHome() {
        return "index";
    }
}