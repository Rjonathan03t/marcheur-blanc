package org.hei.carte;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Marcheur {
    private String nom;
    private Rue rue;
    private String lieuDepart;
    private Carte carte;


    public Marcheur( String nom, Rue rue,String lieuDepart,Carte carte) {
        this.nom = nom;
        this.rue = rue;
        this.lieuDepart = lieuDepart;
        this.carte = carte;
    }

    public List<Rue> marcherAleatoirement(Lieu depart, Lieu arrive) {
        List<Rue> trajet = new ArrayList<>();
        List<Lieu> visite = new ArrayList<>();
        Random rand = new Random();
        trajet.add(this.carte.getRueParLieu(depart));
        visite.add(depart);

        while (!arrive.equals(depart)) {
            int indexRueAleatoire = rand.nextInt(this.carte.getNombreDeRues());
            Rue rueChoisie = this.carte.getRue(indexRueAleatoire);

            Lieu prochainLieu = rueChoisie.getLieuArrive();
            if (!visite.contains(prochainLieu)) {
                trajet.add(rueChoisie);
                visite.add(prochainLieu);
                depart = prochainLieu;
            }
        }
        System.out.println(trajet);
        return trajet;
    }
}
