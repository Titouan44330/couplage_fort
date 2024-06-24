package org.ss.orchestre.couplagefort;

public class Musicien {
    private Instrument instrument;
    private Morceau morceau;

    public Musicien(Instrument instrument, Morceau morceau) {
        this.instrument = instrument;
        this.morceau = morceau;
    }

    public Musicien(Instrument instrument) {
        this.instrument = instrument;
    }

    public void jouerMorceau() {
        instrument.afficher();
        System.out.println("et je joue le morceau " + morceau.getNom());
        instrument.jouer();
    }
}
