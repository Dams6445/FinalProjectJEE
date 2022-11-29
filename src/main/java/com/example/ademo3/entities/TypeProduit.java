package com.example.ademo3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "typeProduit")
public class TypeProduit {

    @Id
    @Column(name = "typeProduit_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "typeProduit_nom")
    private String nom;


    @ManyToMany
    @JoinTable(name = "categorie_typeProduit",
            joinColumns = @JoinColumn(name = "typeProduit_id", referencedColumnName="typeProduit_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id", referencedColumnName="categorie_id"))
    private List<Categorie> categorie;

    /////////////////////////////
    //////GETTER AND SETTER//////
    /////////////////////////////

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public List<Categorie> getCategorie() { return categorie; }

    public void setCategorie(List<Categorie> categorie) { this.categorie = categorie; }


}
