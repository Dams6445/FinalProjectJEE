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
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListeController {

    @Autowired
    CategorieService categorieService;

    @Autowired
    PromotionService promotionService;

    @Autowired
    ProduitService produitService;

    @GetMapping("/lister")
    public String listerLaBase(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        List<Produit> produits = produitService.getAllProduits();
        List<Promotion> promotions = promotionService.getAllPromotions();

        model.addAttribute("categories", categories);
        model.addAttribute("promotions", promotions);
        model.addAttribute("produits", produits);

        return "lister";
    }
}
