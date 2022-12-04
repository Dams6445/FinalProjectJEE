package com.example.springjee.entities;

import org.hibernate.type.ImageType;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @Column(name = "categorie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "categorie_nom", nullable = false)
    private String nom;

    @Column(name = "categorie_image")
    private ImageType image;

    public Categorie(){

    }

    public Categorie(String nom, ImageType image) {
        this.nom = nom;
        this.image = image;
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

    public ImageType getImage() {
        return image;
    }

    public void setImage(ImageType image) {
        this.image = image;
    }
}
