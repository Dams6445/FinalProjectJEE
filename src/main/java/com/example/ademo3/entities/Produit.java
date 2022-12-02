package com.example.ademo3.entities;

import org.hibernate.type.ImageType;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {

    //TODO Utiliser thymleaf pour afficher dans html
    @Id
    @Column(name = "produit_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "produit_reference")
    private String reference;

    @Column(name = "produit_nom")
    private String nom;

    @Column(name = "produit_prix")
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @Column(name = "produit_description")
    private StringNVarcharType description;

    @Column(name = "produit_image")
    private ImageType image;

    /*public Produit(String reference, String nom, Float prix, Categorie categorie ){
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }*/

    /////////////////////////////
    //////GETTER AND SETTER//////
    /////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setImage(ImageType nom) {
        this.image = image;
    }

}
