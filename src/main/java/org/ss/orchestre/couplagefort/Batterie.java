package org.ss.orchestre.couplagefort;

public class Batterie implements Instrument{
    @Override
    public void afficher() {
        System.out.println("Je suis une Batterie...");
    }

    @Override
    public void jouer() {
        System.out.println("Boom Boom Schack");
    }
}
