package com.example.springjee.entities;

import org.hibernate.type.ImageType;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;

@Entity
@Table(name = "promotion")
public class Promotion {

    @Id
    @Column(name = "promotion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "promotion_nom", nullable = false)
    private String nom;

    @Column(name = "promotion_reduction", nullable = false)
    private Float reduction;

    @OneToOne
    @JoinColumn(name = "produit",nullable = false)
    private Produit produit;


    /////////////////////////////
    //////   CONSTRUCTOR   //////
    /////////////////////////////

    public Promotion(){

    }


    public Promotion(String nom, Float reduction, Produit produit){
        this.nom = nom;
        this.reduction = reduction;
        this.produit = produit;
    }


    /////////////////////////////
    //////GETTER AND SETTER//////
    /////////////////////////////

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getReduction() {
        return reduction;
    }

    public void setReduction(Float prix) {
        this.reduction = prix;
    }

    public Produit getCategorie() { return produit; }

    public void setCategorie(Produit produit) { this.produit = produit; }

    public Produit getProduit() { return produit; }

    public void setProduit(Produit produit) { this.produit = produit; }

}


