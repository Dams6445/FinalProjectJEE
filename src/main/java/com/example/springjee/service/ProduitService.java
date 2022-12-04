package com.example.springjee.service;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.TypeProduit;
import com.example.springjee.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public void addProduit(Produit produit){
        produitRepository.save(new Produit(produit.getReference(), produit.getNom(), produit.getPrix(), produit.getCategorie(), null, null));
    }

    public void deleteProduitByNom(String nom) { produitRepository.delete(produitRepository.findProduitByNom(nom));}

}
