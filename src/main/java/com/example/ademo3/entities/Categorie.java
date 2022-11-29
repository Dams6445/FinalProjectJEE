package com.example.ademo3.entities;

import org.hibernate.type.ImageType;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @Column(name = "categorie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int categorie_id;

    @Column(name = "categorie_nom")
    private String nom;

    @Column(name = "categorie_image")
    private ImageType image;

    /////////////////////////////
    //////GETTER AND SETTER//////
    /////////////////////////////

    public long getId_categorie() {
        return categorie_id;
    }

    public void setId_categorie(int id_categorie) {
        this.categorie_id = id_categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ImageType getImage() {
        return image;
    }

    public void setImage(ImageType nom) {
        this.image = image;
    }

}