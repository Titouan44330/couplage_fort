package org.ss.orchestre.couplagefort;

public class Piano implements Instrument{

    @Override
    public void afficher() {
        System.out.println("Je suis un Piano...");
    }

    @Override
    public void jouer() {
        System.out.println("LA LA LA");
    }
}
