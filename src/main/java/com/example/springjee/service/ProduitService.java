package com.example.springjee.service;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.TypeProduit;
import com.example.springjee.repository.ProduitRepository;
import org.hibernate.type.ImageType;
import org.hibernate.type.StringNVarcharType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }

    public void addProduit(String reference, String nom, Float prix, Categorie categorie, TypeProduit typeProduit){
        produitRepository.save(new Produit(reference, nom, prix, categorie, typeProduit, null, null));
    }

    public void deleteProduitByNom(String nom) { produitRepository.delete(produitRepository.findProduitByNom(nom));}

    public void  deletedProduit(Produit produit) { produitRepository.delete(produit);}
}
