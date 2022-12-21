package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Promotion;
import com.example.springjee.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateController {

    @Autowired
    CategorieService categorieService;

    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @RequestMapping("/update")
    public String update(){
        return "update";
    }

    @RequestMapping("/updateCategorie")
    public String updateCategorie(@ModelAttribute Categorie categorie, Model modele) {
        modele.addAttribute("categorie", categorie);
        categorieService.updateCategorie(categorie);
        return "update";
    }
}
