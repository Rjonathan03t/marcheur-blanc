package org.hei.carte;
import org.hei.carte.Lieu;
import org.hei.carte.Rue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Marcheur {
    private Lieu lieuActuel;
    private List<Lieu> parcours = new ArrayList<>();
    private Random rand = new Random();

    public Marcheur(Lieu lieuInitial) {
        this.lieuActuel = lieuInitial;
        this.parcours.add(lieuInitial);
    }

    public List<Lieu> marcherAleatoirement(Lieu destination) {
        while (!lieuActuel.equals(destination)) {
            List<Rue> rues = lieuActuel.getRues();
            List<Rue> ruesDisponibles = new ArrayList<>();

            for (Rue rue : rues) {
                Lieu prochainLieu = rue.getLieuArrive();
                if (!parcours.contains(prochainLieu) || prochainLieu.equals(destination)) {
                    ruesDisponibles.add(rue);
                }
            }
            if (!ruesDisponibles.isEmpty()) {
                Rue rueChoisie = ruesDisponibles.get(rand.nextInt(ruesDisponibles.size()));
                Lieu prochainLieu = rueChoisie.getLieuArrive();
                lieuActuel = prochainLieu;
                parcours.add(prochainLieu);
            } else {
                parcours.remove(lieuActuel);
                lieuActuel = parcours.get(parcours.size() - 1);
            }
        }
        return parcours;
    }

    public List<Lieu> getParcours() {
        return parcours;
    }
}
