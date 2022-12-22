package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
import com.example.springjee.repository.CategorieRepository;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import com.example.springjee.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class AddController {
    @Autowired
    CategorieService categorieService;
    @Autowired
    ProduitService produitService;
    @Autowired
    PromotionService promotionService;

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

    @RequestMapping("/ajouter")
    public String ajouter(){
        return "ajouter";
    }

    @PostMapping("/ajouterProduit")
    public String ajouterProduit(@ModelAttribute Produit produit, Model modele){
        modele.addAttribute("produit", produit);
        produitService.addProduit(produit);
        return  "ajouter";
    }
    @PostMapping("/ajouterCategorie")
    public String ajouterCategorie(@ModelAttribute Categorie categorie,@RequestParam(value = "image", required = false) String path, Model modele) throws IOException {
        String filePath = "./src/main/resources/pictures/" + path;
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        categorie.setImage(bytes);
        modele.addAttribute("categorie", categorie);
        categorieService.addCategorie(categorie);
        return "ajouter";
    }
    @PostMapping("/ajouterPromotion")
    public String ajouterCategorie(@ModelAttribute Promotion promotion, Model modele) {
        modele.addAttribute("promotion", promotion);
        promotionService.addPromotion(promotion);
        return "ajouter";
    }
}
