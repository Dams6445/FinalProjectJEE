package com.example.springjee.service;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public List<Produit> getAllProduits() { return produitRepository.findAll();}

    public List<Produit> getProduitByCategorie(Integer idCategorie) { return produitRepository.findProduitByCategorie(idCategorie);}

    public Produit getProduitByNom(String nom) { return produitRepository.findProduitByNom(nom);}

    public Produit getProduitByRef(String reference) { return produitRepository.findProduitByReference(reference);}

    public List<Produit> getProduitByPrix(Float prix) { return produitRepository.findProduitByPrix(prix);}

    public void addProduit(Produit produit){
        produitRepository.save(new Produit(produit.getReference(), produit.getNom(), produit.getPrix(), produit.getCategorie(), produit.getDescription(), null /*produit.getImage()*/));
    }

    public void deleteProduitByNom(String nom) { produitRepository.delete(produitRepository.findProduitByNom(nom));}

    public void deleteProduitByReference(String reference) { produitRepository.delete(produitRepository.findProduitByReference(reference));}

    public void updateProduit(Produit produit){
        Produit produitFromDB = produitRepository.findById(produit.getId())
                .orElse(new Produit(produit.getReference(), produit.getNom(), produit.getPrix(), produit.getCategorie(), produit.getDescription(), produit.getImage()));
        if(!("".equals(produit.getNom()))) {
            produitFromDB.setNom(produit.getNom());
        }
        if(!("".equals(produit.getReference()))) {
            produitFromDB.setReference(produit.getReference());
        }
        if(produit.getPrix() != null) {
            produitFromDB.setPrix(produit.getPrix());
        }
        if(produit.getCategorie() != null) {
            produitFromDB.setCategorie(produit.getCategorie());
        }
        if(!("".equals(produit.getDescription()))) {
            produitFromDB.setDescription(produit.getDescription());
        }
        if(produit.getImage() != null) {
            produitFromDB.setImage(produit.getImage());
        }
        produitRepository.save(produitFromDB);
    }
}
