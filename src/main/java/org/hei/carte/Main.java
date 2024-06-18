package org.hei.carte;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lieu hei = new Lieu("HEI");
        Lieu pullman = new Lieu("Pullman");
        Lieu balancoire = new Lieu("Balançoire");
        Lieu nexta = new Lieu("Nexta");
        Lieu boulevard = new Lieu("Boulevard");
        Lieu esti = new Lieu("ESTI");

        Rue rue1 = new Rue("Andriatsihoarana", hei, pullman);
        Rue rue2 = new Rue("Rue Ranaivo", pullman, balancoire);
        Rue rue3 = new Rue("Rue sans nom 1", hei, balancoire);
        Rue rue4 = new Rue("Rue sans nom 2", balancoire, hei);
        Rue rue5 = new Rue("Rue Ranaivo", balancoire, pullman);
        Rue rue6 = new Rue("Rue sans nom 4", balancoire, esti);
        Rue rue7 = new Rue("Rue sans nom 3", nexta, pullman);
        Rue rue8 = new Rue("Rue sans nom 5", pullman, nexta);
        Rue rue9 = new Rue("Rue sans nom 6", boulevard, balancoire);
        Rue rue10 = new Rue("Rue sans nom 7", balancoire, boulevard);
        Rue rue11 = new Rue("Rue sans nom 8", boulevard, esti);
        Rue rue12 = new Rue("Rue sans nom 9", esti, boulevard);

        hei.ajouterRue(rue1);
        pullman.ajouterRue(rue2);
        balancoire.ajouterRue(rue3);
        balancoire.ajouterRue(rue4);
        balancoire.ajouterRue(rue5);
        balancoire.ajouterRue(rue6);
        nexta.ajouterRue(rue7);
        pullman.ajouterRue(rue8);
        boulevard.ajouterRue(rue9);
        balancoire.ajouterRue(rue10);
        boulevard.ajouterRue(rue11);
        esti.ajouterRue(rue12);


        Marcheur bjarni = new Marcheur(hei);
        List<Lieu> parcours = bjarni.marcherAleatoirement(esti);

        System.out.println("Le parcours de Bjarni de HEI à ESTI est :");
        for (Lieu lieu : parcours) {
            System.out.print(lieu.getNom() + " -> ");
        }
        System.out.println("FIN");
    }
}
