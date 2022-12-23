package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
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
        if ( idCategorie == 0){
            List<Produit> produits = produitService.getAllProduits();
            model.addAttribute("produits", produits);
        }
        else {
            List<Produit> produits = produitService.getProduitByCategorie(idCategorie);
            model.addAttribute("produits", produits);
        }

        return "produits";
    }

}
