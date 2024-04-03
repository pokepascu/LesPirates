package plateau;

import joueurs.Pions;

public class Malux extends Case {
	 
    public Malux(int numero) {
        super(numero, Type.MALUX);
    }
    
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.perdreVie(3);
        pion.setModifierDe(-5);
        return pion.getNom() + " monte à bord du vaiseau Nossa Senhora do Cabo de Labuse!";
    }


}
