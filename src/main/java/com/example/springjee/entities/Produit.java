package com.example.springjee.entities;

import org.hibernate.type.ImageType;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @Column(name = "produit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "produit_reference", nullable = false)
    private String reference;

    @Column(name = "produit_nom", nullable = false)
    private String nom;

    @Column(name = "produit_prix", nullable = false)
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "categorie",nullable = false)
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "typeProduit",nullable = false)
    private TypeProduit typeProduit;

    @Column(name = "produit_description")
    private StringNVarcharType description;

    @Column(name = "produit_image")
    private ImageType image;


    /////////////////////////////
    //////   CONSTRUCTOR   //////
    /////////////////////////////

    public Produit(){

    }

    public Produit(String reference, String nom, Float prix, Categorie categorie, TypeProduit typeProduit,
                   StringNVarcharType description, ImageType image){
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
        this.typeProduit = typeProduit;
        this.description = description;
        this.image = image;
    }


    /////////////////////////////
    //////GETTER AND SETTER//////
    /////////////////////////////

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() { return categorie; }

    public void setCategorie(Categorie categorie) { this.categorie = categorie; }

    public StringNVarcharType getDescription() {
        return description;
    }

    public void setDescription(StringNVarcharType annee_sortie) { this.description = annee_sortie; }

    public ImageType getImage() {
        return image;
    }

    public void setImage(ImageType image) {
        this.image = image;
    }

    public TypeProduit getTypeProduit() { return typeProduit; }

    public void setTypeProduit(TypeProduit typeProduit) { this.typeProduit = typeProduit; }
}


