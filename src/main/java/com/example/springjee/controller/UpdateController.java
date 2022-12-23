package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import com.example.springjee.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class UpdateController {

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

    @RequestMapping("/update")
    public String update(){
        return "update";
    }
/*
    @RequestMapping("/updateCategorie")
    public String updateCategorie(@ModelAttribute Categorie categorie, @RequestParam(value = "imageCategorie", required = false) String path, Model modele) throws IOException {
        if(!("".equals(path))) {
            String filePath = "./src/main/resources/pictures/" + path;
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            categorie.setImage(bytes);
        }
        modele.addAttribute("categorie", categorie);
        categorieService.updateCategorie(categorie);
        return "update";
    }

    @RequestMapping("/updateProduit")
    public String updateProduit(@ModelAttribute Produit produit, @RequestParam(value = "imageProduit", required = false) String path, Model modele) throws IOException {
        if(!("".equals(path))) {
            String filePath = "./src/main/resources/pictures/" + path;
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            produit.setImage(bytes);
        }
        modele.addAttribute("produit", produit);
        produitService.updateProduit(produit);
        return "update";
    }

 */
    @RequestMapping("/updatePromotion")
    public String updatePromotion(@ModelAttribute Promotion promotion, Model modele) {
        modele.addAttribute("promotion", promotion);
        promotionService.updatePromotion(promotion);
        return "update";
    }
}
