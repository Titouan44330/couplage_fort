package org.ss.orchestre.couplagefort;

public class Instrument {
    private String nom;
    private String type;

    public Instrument(String nom) {
        this.nom = nom;
    }
    public Instrument(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }
    public void afficher() {
        System.out.println("Je suis un "+this.nom+"...");
    }
    public void jouer() {
        if(this.nom == "Batterie") {
            System.out.println("Boom Boom Schack");
        } else if (this.nom == "Piano") {
            System.out.println("LA LA LA");
        } else if (this.nom == "Violon") {
            System.out.println("ZIN ZIN ZIN");
        }
    }
}
