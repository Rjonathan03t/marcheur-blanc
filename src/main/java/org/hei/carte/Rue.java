package org.hei.carte;

public class Rue {
    private String nom;
    private Lieu lieuDepart;
    private Lieu lieuArrive;

    public Rue(String nom, Lieu lieuDepart, Lieu lieuArrive) {
        this.nom = nom;
        this.lieuDepart = lieuDepart;
        this.lieuArrive = lieuArrive;
    }

    public String getNom() {
        return nom;
    }

    public Lieu getLieuDepart() {
        return lieuDepart;
    }

    public Lieu getLieuArrive() {
        return lieuArrive;
    }

    @Override
    public String toString() {
        return nom;
    }
}
