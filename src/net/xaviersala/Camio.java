package net.xaviersala;

import java.util.List;
import java.util.ArrayList;

public class Camio {

    private int pesMaxim;
    private List<Vaca> vaques = new ArrayList<>();

    public Camio(int max) {
        pesMaxim = max;
    }

    public boolean posarVaca(Vaca vaca) {

        if (pesVaques() + vaca.getPes() > pesMaxim) {
            return false;
        }

        vaques.add(vaca);
        return true;

    }

    private int pesVaques() {
        int pes = 0;
        for(Vaca vaca: vaques) {
            pes += vaca.getPes();
        }
        return pes;
    }

    public void treureVaques() {
        vaques.clear();
    }

    public int lletVaques() {
        int llet = 0;
        for(Vaca vaca: vaques) {
            llet += vaca.getLitres();
        }
        return llet;
    }

    @Override
    public String toString() {
        return vaques.toString();
    }


























}
