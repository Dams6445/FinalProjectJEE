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

import java.util.List;

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
    public String ajouter(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "ajouter";
    }
    @RequestMapping("/ajouterCategorie")
    public String afficherAjouterCategorie(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "ajouterCategorie";
    }
    @RequestMapping("/ajouterProduit")
    public String afficherAjouterProduit(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "ajouterProduit";
    }

    @PostMapping("/ajoutCategorie")
    public String ajouterCategorie(@ModelAttribute Categorie categorie, Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        categorieService.addCategorie(categorie);
        return "ajouterCategorie";
    }

    @PostMapping("/ajoutProduit")
    public String ajouterProduit(@ModelAttribute Produit produit, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("produit", produit);
        produitService.addProduit(produit);
        return  "ajouterProduit";
    }
    @RequestMapping("/ajouterPromotion")
    public String afficherAjouterPromotion(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "ajouterPromotion";
    }
    @PostMapping("/ajoutPromotion")
    public String ajouterPromotion(@ModelAttribute Promotion promotion, Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("promotion", promotion);
        promotionService.addPromotion(promotion);
        return "ajouterPromotion";
    }
}
