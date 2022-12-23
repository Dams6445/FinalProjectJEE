package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import com.example.springjee.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProduitsController {

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
    public Produit produit() { return new Produit(); }

    @RequestMapping("/produits")
    public String displayHome(@RequestParam Integer idCategorie,Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        List<Produit> produits;
        if ( idCategorie == 0){
            produits = produitService.getAllProduits();
        }
        else {
            produits = produitService.getProduitByCategorie(idCategorie);
        }
        float prix;
        for(Produit produit : produits){
            prix = promotionService.getPromotionbyProduit(produit);
            produit.setPrix(prix);
        }
        model.addAttribute("produits", produits);
        return "produits";
    }

}
