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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/updateCategorie")
    public String updateCategorie(@ModelAttribute Categorie categorie, Model modele) {
        modele.addAttribute("categorie", categorie);
        categorieService.updateCategorie(categorie);
        return "update";
    }
    @RequestMapping("/updateProduit")
    public String updateProduit(@ModelAttribute Produit produit, Model modele) {
        modele.addAttribute("produit", produit);
        produitService.updateProduit(produit);
        return "update";
    }
    @RequestMapping("/updatePromotion")
    public String updatePromotion(@ModelAttribute Promotion promotion, Model modele) {
        modele.addAttribute("promotion", promotion);
        promotionService.updatePromotion(promotion);
        return "update";
    }
}
