package joueurs;
import java.util.ArrayList;
import java.util.List;

import plateau.Type;

public class Joueur {
	private String nom;
	private int vie = 5;
	private List<Object> inventaire = new ArrayList<>();
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getVie() {
		return vie;
	}
	
	public void perdreVie(int pv) {
		
			vie -= pv;
	}
	
	public void gagnerVie(int pv) {
		vie += pv;
		if (vie > 5) {
	        vie = 5;
	    }
	}
}