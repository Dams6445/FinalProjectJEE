package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import com.example.springjee.service.TypeProduitService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
class DeleteController {

    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @Autowired
    CategorieService categorieService;

    @Autowired
    ProduitService produitService;

    @Autowired
    TypeProduitService typeProduitService;


    @GetMapping("/supprimerProduit")
    public String displayDelete(Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories",categories);
        return "supprimerProduit";
    }

    @PostMapping("/supprimerProduit")
    public String deleteCategorie(@ModelAttribute Categorie categorie, Model model){
        model.addAttribute("categorie",categorie);
        categorieService.deleteCategorieByNom(categorie.getNom());
        return "supprimerProduit";
    }

}
