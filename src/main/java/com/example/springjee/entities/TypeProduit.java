package com.example.springjee.entities;


import org.hibernate.type.ImageType;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "typeProduit")
public class TypeProduit {

    @Id
    @Column(name = "typeProduit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "typeProduit_nom", nullable = false)
    private String nom;

    /*
    @ManyToMany
    @JoinTable(name = "categorie_typeProduit",
            joinColumns = @JoinColumn(name = "typeProduit_id", referencedColumnName="typeProduit_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id", referencedColumnName="categorie_id"))
    private List<Categorie> categorie;
    */

    /////////////////////////////
    //////   CONSTRUCTOR   //////
    /////////////////////////////

    public TypeProduit(){

    }

    public TypeProduit(String nom, List<Categorie> categorie){
        this.nom = nom;
        //this.categorie = categorie;
    }


    /////////////////////////////
    //////GETTER AND SETTER//////
    /////////////////////////////

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    /*
    public List<Categorie> getCategorie() { return categorie; }

    public void setCategorie(List<Categorie> categorie) { this.categorie = categorie; }
    */

}

