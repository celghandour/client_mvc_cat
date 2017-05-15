package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by celghandour on 14/05/17.
 */

@Entity
public class Produit implements Serializable {
    @Id @GeneratedValue

    private Long id;
    private String designation ;
    private double prix ;
    private int quantité ;

    public Produit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public Produit(String designation, double prix, int quantité) {
        this.designation = designation;
        this.prix = prix;
        this.quantité = quantité;

    }

}


