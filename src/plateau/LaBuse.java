package plateau;

import joueurs.Pions;

public class Labuse extends Case {
	 
    public Labuse(int numero) {
        super(numero, Type.LABUSE);
    }
    
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.gagnerVie(1);
        pion.setModifierDe(+4);
        return pion.getNom() + " monte à bord du vaiseau Nossa Senhora do Cabo de Labuse!";
    }


}