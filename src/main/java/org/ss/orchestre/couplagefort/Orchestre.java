package org.ss.orchestre.couplagefort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Orchestre {
	private List<Musicien> listeMusiciens;
	
	public Orchestre() {
		listeMusiciens = new ArrayList<>();
	}
	
	public void ajout(Musicien musicien) {
		listeMusiciens.add(musicien);
	}

	public void jouer() {
		listeMusiciens.stream().forEach(musicien -> musicien.jouerMorceau());
	}
}
