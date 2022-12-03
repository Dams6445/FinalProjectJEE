package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
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

    @ModelAttribute("produit")
    public Produit produit() {
        return new Produit();
    }

    @ModelAttribute("promotion")
    public Promotion promotion() {
        return new Promotion();
    }

    @Autowired
    CategorieService categorieService;

    @Autowired
    ProduitService produitService;

    @Autowired
    TypeProduitService typeProduitService;


    @GetMapping("/supprimer")
    public String displayDelete(Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories",categories);
        return "supprimer";
    }

    @PostMapping("/supprimerCategorie")
    public String deleteCategorie(@ModelAttribute Categorie categorie, Model model){
        model.addAttribute("categorie",categorie);
        categorieService.deleteCategorieByNom(categorie.getNom());
        return "supprimer";
    }

    @PostMapping("/supprimerProduitParNom")
    public String deleteProduitByNom(@ModelAttribute Produit produit, Model model){
        model.addAttribute("produit",produit);
        produitService.deleteProduitByNom(produit.getNom());
        return "supprimer";
    }

    @PostMapping("/supprimerProduitParRef")
    public String deleteProduitByRef(@ModelAttribute Produit produit, Model model){
        model.addAttribute("produit", produit);
        produitService.deleteProduitByReference(produit.getReference());
        return "supprimer";
    }

    @DeleteMapping("/supprimerPromotion")
    public String deletePromotion(@ModelAttribute Promotion promotion, Model model){
        return "supprimer";
    }


}
