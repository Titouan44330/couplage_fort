package org.ss.orchestre.couplagefort;
public class App {
	public static void main(String[] args) {
		Morceau morceau = new Morceau("La 9eme de Beethoven");

		System.out.println("Le pianiste : ");
		Musicien pianiste = new Musicien(new Piano(),morceau);
		pianiste.jouerMorceau();

		System.out.println("Le violoniste : ");
		Musicien violoniste = new Musicien(new Violon(),morceau);
		violoniste.jouerMorceau();

		System.out.println("Le batteur : ");
		Musicien batteur = new Musicien(new Batterie(), morceau);
		batteur.jouerMorceau();

		System.out.println("\n L'orchestre : ");
		Orchestre orchestre = new Orchestre();
		orchestre.ajout(pianiste);
		orchestre.ajout(violoniste);
		orchestre.ajout(batteur);
		orchestre.jouer();
	}
}
