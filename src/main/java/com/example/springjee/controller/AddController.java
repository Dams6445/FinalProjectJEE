package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddController {
    @Autowired
    CategorieService categorieService;
    @Autowired
    ProduitService produitService;

    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @ModelAttribute("produit")
    public Produit produit() {
        return new Produit();
    }

    @RequestMapping("/ajouter")
    public String ajouter(){
        return "ajouter";
    }

    @PostMapping("/ajouterProduit")
    public String ajouterProduit(@ModelAttribute Produit produit, Model modele){
        modele.addAttribute("produit", produit);
        produitService.addProduit(produit.getReference(), produit.getNom(), produit.getPrix(), produit.getCategorie(), produit.getTypeProduit());
        return  "ajouter";
    }


    @PostMapping("/ajouterCategorie")
    public String ajouterCategorie(@ModelAttribute Categorie categorie, Model modele) {
        modele.addAttribute("categorie", categorie);
        categorieService.addCategorie(categorie);
        return "ajouter";
    }
}
