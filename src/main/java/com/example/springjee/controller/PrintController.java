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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PrintController {

    @Autowired
    ProduitService produitService;

    @Autowired
    CategorieService categorieService;

    @Autowired
    PromotionService promotionService;


    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @GetMapping("/afficher")
    public String displayPrint() {
        return "afficher";
    }


    @PostMapping("/afficherProduitParCategorie")
    public String displayProduitByCategorie(@ModelAttribute("categorie") Categorie categorie, Model model){
        model.addAttribute("categorie",categorie);
        List<Produit> produits = produitService.getProduitByCategorie(categorieService.getCategorieByNom(categorie.getNom()).getId_categorie());
        model.addAttribute("produits", produits);
        return "afficher";
    }

    @PostMapping("/afficherPromotionParCategorie")
    public String displayPromotionByCategorie(@ModelAttribute("categorie") Categorie categorie, Model model){
        model.addAttribute("categorie",categorie);
        List<Promotion> promotions = promotionService.getPromotionByCategoie(categorieService.getCategorieByNom(categorie.getNom()).getId_categorie());
        model.addAttribute("promotions", promotions);
        return "afficher";
    }

}
