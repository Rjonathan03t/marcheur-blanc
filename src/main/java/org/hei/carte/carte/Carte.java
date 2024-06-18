package org.hei.carte.carte;

import java.util.ArrayList;
import java.util.List;

public class Carte {
    private List<Lieu> lieux = new ArrayList<>();
    private List<Rue> rues = new ArrayList<>();

    public Carte(List<Lieu> lieux, List<Rue> rues) {
        this.lieux = lieux;
        this.rues = rues;
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
    public Rue getRue(int index) {
        if (index >= 0 && index < rues.size()) {
            return rues.get(index);
        } else {
            return null;
        }
    }
}
