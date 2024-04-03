package plateau;

import java.util.Random;


public class Plateau {
    private Case[] cases;
    private int nbCases = Type.CASES.getQuantite();

    public Plateau(int nbCases) {
        cases = new Case[nbCases];
        this.nbCases = nbCases;
        initialiserPlateau();
    }

    private void initialiserPlateau() {
    	genererCases(Type.NORMALE);
    	genererCases(Type.BONUX);
    	genererCases(Type.BONUS);
    	genererCases(Type.MALUS);
    	genererCases(Type.MALUX);
    	genererCases(Type.LABUSE);
    	genererCases(Type.DUEL);

    }

    private void genererCases(Type type) {
        Random random = new Random();
        int position;
        int quantite = type.getQuantite();

        for (int i = 0; i < quantite; i++) {
            do {
                position = random.nextInt(nbCases); 
            } while (getCases()[position] != null);
            	getCases()[position] = creerCase(type, position);
        }
    }

    private Case creerCase(Type type, int numero) {
        switch (type) {
        	case LABUSE:
        		return new Labuse(numero);
        	case BONUS:
        		return new Bonus(numero);
            case BONUX:
                return new Bonux(numero);
            case MALUX:
                return new Malus(numero);
            case MALUS:
                return new Malus(numero);
            case DUEL:
                return new Duel(numero);
            case NORMALE:
                return new Normale(numero);
		default:
			break;
      
        }
		return null;
    }

	public Case[] getCases() {
		return cases;
	}

	public int getNbCases() {
		return nbCases;
	}
    

}