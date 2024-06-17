package org.hei.carte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carte {
    private List<Lieu> lieux = new ArrayList<>();
    private List<Rue> rues = new ArrayList<>();
    private Map<Lieu, Rue> lieuxARues = new HashMap<>();

    public Carte(List<Lieu> lieux, List<Rue> rues) {
        this.lieux = lieux;
        this.rues = rues;
        for (Rue rue : rues) {
            lieuxARues.put(rue.getLieuDepart(), rue); // On suppose que LieuDepart est unique
            lieuxARues.put(rue.getLieuArrive(), rue); // On suppose que LieuArrive est unique
        }
    }

    public List<Lieu> getLieux() {
        return lieux;
    }

    public List<Rue> getRues() {
        return rues;
    }
    public int getNombreDeRues() {
        return this.rues.size();
    }
    public Rue getRueParLieu(Lieu lieu) {
        return lieuxARues.get(lieu);
    }
    public Rue getRue(int index) {
        if (index >= 0 && index < rues.size()) {
            return rues.get(index);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Carte{" +
                "lieux=" + lieux +
                ", rues=" + rues +
                ", lieuxARues=" + lieuxARues +
                '}';
    }
}
