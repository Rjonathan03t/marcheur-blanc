package org.hei.carte;

public class Lieu {
    private String nom;
    public Lieu(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Lieu{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
