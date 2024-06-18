package org.hei.carte;

import java.util.ArrayList;
import java.util.List;

public class Lieu {
    private String nom;
    private List<Rue> rues = new ArrayList<>();

    public Lieu(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterRue(Rue rue) {
        rues.add(rue);
    }

    public List<Rue> getRues() {
        return rues;
    }

    @Override
    public String toString() {
        return nom;
    }
}
