package org.ss.orchestre.couplagefort;

public class Violon implements Instrument{
    @Override
    public void afficher() {
        System.out.println("Je suis un Violon...");
    }

    @Override
    public void jouer() {
        System.out.println("ZIN ZIN ZIN");
    }
}
