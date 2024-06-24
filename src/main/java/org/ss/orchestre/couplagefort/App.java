package org.ss.orchestre.couplagefort;
public class App {
	public static void main(String[] args) {
		System.out.println("Le pianiste : ");
		Piano piano = new Piano();
		Morceau morceau1 = new Morceau("La 9eme de Beethoven");
		Musicien pianiste = new Musicien(piano,morceau1);
		pianiste.jouerMorceau();

		System.out.println("Le violoniste : ");
		Violon violon = new Violon();
		Morceau morceau2 = new Morceau("La 9eme de Beethoven");
		Musicien violoniste = new Musicien(violon,morceau2);
		violoniste.jouerMorceau();

		System.out.println("Le batteur : ");
		Batterie batterie = new Batterie();
		Morceau morceau3 = new Morceau("La 9eme de Beethoven");
		Musicien batteur = new Musicien(batterie, morceau3);
		batteur.jouerMorceau();

		System.out.println("\n L'orchestre : ");
		Orchestre orchestre = new Orchestre();
		orchestre.ajout(pianiste);
		orchestre.ajout(violoniste);
		orchestre.ajout(batteur);
		orchestre.jouer();
	}
}
