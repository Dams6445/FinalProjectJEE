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
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FindController {

    @Autowired
    CategorieService categorieService;

    @Autowired
    ProduitService produitService;

    @Autowired
    PromotionService promotionService;


    @ModelAttribute("categorieParNom")
    public Categorie categorieParNom() {
        return new Categorie();
    }

    @ModelAttribute("produitParNom")
    public Produit produitParNom() {
        return new Produit();
    }

    @ModelAttribute("produitParRef")
    public Produit produitParRef() {
        return new Produit();
    }

    @ModelAttribute("produitParPrix")
    public Produit produit() {
        return new Produit();
    }

    @ModelAttribute("promotionParNom")
    public Promotion promotionParNom() {
        return new Promotion();
    }

    @ModelAttribute("promotionParPrix")
    public Promotion promotionParPrix() {
        return new Promotion();
    }



    @RequestMapping("/rechercher")
    public String displayRecherche(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "rechercher";
    }



    @PostMapping("/rechercherCategorie")
    public String findCategorie(@ModelAttribute Categorie categorie, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        Categorie categorieTrouve = categorieService.getCategorieByNom(categorie.getNom());
        model.addAttribute("categorieParNom", categorieTrouve);
        return "rechercher";
    }



    @PostMapping("/rechercherProduitParNom")
    public String findProduitParNom(@ModelAttribute Produit produit, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        Produit produitTrouve = produitService.getProduitByNom(produit.getNom());
        model.addAttribute("produitParNom", produitTrouve);
        return "rechercher";
    }

    @PostMapping("/rechercherProduitParRef")
    public String findProduitParRef(@ModelAttribute Produit produit, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        Produit produitTrouve = produitService.getProduitByRef(produit.getReference());
        model.addAttribute("produitParRef", produitTrouve);
        return "rechercher";
    }

    @PostMapping("/rechercherProduitParPrix")
    public String findProduitParPrix(@ModelAttribute Produit produit, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        List<Produit> produits = produitService.getProduitByPrix(produit.getPrix());
        model.addAttribute("produitsParPrix", produits);
        return "rechercher";
    }



    @PostMapping("/rechercherPromotionParNom")
    public String findPromotionParNom(@ModelAttribute Promotion promotion, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        Promotion promotionTrouve = promotionService.getPromotionByNom(promotion.getNom());
        model.addAttribute("promotionParNom", promotionTrouve);
        return "rechercher";
    }

    @PostMapping("/rechercherPromotionParPrix")
    public String findPromotionParPrix(@ModelAttribute Promotion promotion, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        List<Promotion> promotions = promotionService.getPromotionByPrix(promotion.getReduction());
        model.addAttribute("promotionsParPrix", promotions);
        return "rechercher";
    }

}
