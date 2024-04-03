package plateau;

import joueurs.Pions;

public class Bonus extends Case {
	 
    public Bonus(int numero) {
        super(numero, Type.BONUS);
    }
    
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.gagnerVie(1);
        pion.setModifierDe(+1s);
        return pion.getNom() + " Petite aide hehe!";
    }


}