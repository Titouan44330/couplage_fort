package org.ss.orchestre.couplagefort;
public class App {
	public static void main(String[] args) {
		System.out.println("Le pianiste : ");
		Instrument instrument1 = new Instrument("Piano");
		Morceau morceau1 = new Morceau("La 9eme de Beethoven");
		Musicien pianiste = new Musicien(instrument1,morceau1);
		pianiste.jouerMorceau();

		System.out.println("Le violoniste : ");
		Instrument instrument2 = new Instrument("Violon");
		Morceau morceau2 = new Morceau("La 9eme de Beethoven");
		Musicien violoniste = new Musicien(instrument2,morceau2);
		violoniste.jouerMorceau();

		System.out.println("Le batteur : ");
		Instrument instrument3 = new Instrument("Batterie");
		Morceau morceau3 = new Morceau("La 9eme de Beethoven");
		Musicien batteur = new Musicien(instrument3, morceau3);
		batteur.jouerMorceau();

		System.out.println("\n L'orchestre : ");
		Orchestre orchestre = new Orchestre();
		orchestre.ajout(pianiste);
		orchestre.ajout(violoniste);
		orchestre.ajout(batteur);
		orchestre.jouer();
	}
}
