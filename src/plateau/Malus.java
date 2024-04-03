package plateau;

import joueurs.Pions;

public class Malus extends Case {
	 
    public Malus(int numero) {
        super(numero, Type.MALUS);
    }
    
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.perdreVie(1);
        pion.setModifierDe(-1);
        return pion.getNom() + " avait pris un peu trop d'avance...";
    }


}