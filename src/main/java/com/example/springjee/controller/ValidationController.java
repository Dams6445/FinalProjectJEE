package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
public class ValidationController {

    @Autowired
    CategorieService categorieService;

    @RequestMapping("/index")
    public String afficherIndex(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "index";
    }

    @RequestMapping("/ajouter")
    public String ajouter(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "ajouter";
    }

    @GetMapping("/supprimer")
    public String displayDelete(Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "supprimer";
    }

    @RequestMapping("/update")
    public String update(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "update";
    }

}
