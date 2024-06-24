package org.ss.orchestre.couplagefort;

public class Morceau {
    private String nom;
    private String compositeur;
    private String duree;

    public Morceau (String nom, String compositeur, String duree) {
        this.nom = nom;
        this.compositeur = compositeur;
        this.duree = duree;
    }
    public Morceau(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public void setCompositeur(String compositeur) {
        this.compositeur = compositeur;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
}
