package org.hei.carte;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            List<Lieu> lieux = new ArrayList<>();
            Lieu hei = new Lieu("HEI");
            Lieu pullman = new Lieu ("pullman");
            List<Rue> rues = new ArrayList<>();
            Rue rueBoulevard = new Rue("bouelevard",hei,pullman);
            lieux.add(hei);
            lieux.add(pullman);
            rues.add(rueBoulevard);
            Carte carte = new Carte(lieux,rues);
            Marcheur personne = new Marcheur("bjarni",rueBoulevard,"HEI",carte);
            personne.marcherAleatoirement(hei,pullman);
        }
    }