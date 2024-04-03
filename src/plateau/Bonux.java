package plateau;

import joueurs.Pions;

public class Bonux extends Case {
	 
    public Bonux(int numero) {
        super(numero, Type.BONUX);
    }
    
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.gagnerVie(3);
        pion.setModifierDe(+5);
        return pion.getNom() + " Excellent!";
    }


}