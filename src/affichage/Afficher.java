package affichage;

import joueurs.Pions;
import plateau.Case;
import plateau.Plateau;

public class Afficher implements Affichage{
	
	
    public void afficherResultatDes(int resultat) {
        System.out.println("Chiffre tiré : " + resultat);
    }
    
    public void afficherTypeCase(Case caseActuelle) {
        if (caseActuelle != null) {
            System.out.println("Vous êtes tombé sur une case de type : " + caseActuelle.getType());
        }
    }
    
    
    public void afficherEffetCase(String message) {
        System.out.println(message);
    }
    
    
    public void afficherPosition(Pions pion) {
        System.out.println("Position de " + pion.getNom() + " : " + (pion.getPosition() + 1));
    }
    
     
    public void afficherPV(Pions pion) {
    	System.out.println("PV de " + pion.getNom() + " : " + pion.getVie());
    }
    
    public void afficherPlateauGraphique(Plateau plateau, Pions pionAlbert, Pions pionBonno) {
        int nbCases = plateau.getNbCases();
        System.out.println("Plateau:");
        for (int i = nbCases; i > 0; i--) {
            int caseNumber = i;
            if (pionAlbert.getPosition() + 1 == caseNumber && pionBonno.getPosition() + 1 == caseNumber) {
                System.out.print("AB ");
            } else if (pionAlbert.getPosition() + 1 == caseNumber) {
                System.out.print("A  ");
            } else if (pionBonno.getPosition() + 1 == caseNumber) {
                System.out.print("B  ");
            } else {
                System.out.print(caseNumber + "  ");
            }
            if (i % 5 == 0) {
                System.out.println(); 
            }
        }
        System.out.println();
    }

    public void afficherFinDeJeu(Pions gagnant) {
        System.out.println("Le joueur " + gagnant.getNom() + " a gagné!");
    }


    public void afficherPlateau(Case[] cases) {
        System.out.println("Plateau:");
        for (int i = 1; i <= cases.length; i++) {
            if (cases[i - 1] != null) {
                System.out.println("Case " + i + ": " + cases[i - 1].getType());
            } else {
                System.out.println("Case " + i + ": Vide");
            }
        }
    }

	public void lancerDe() {
		System.out.println("Appuyez sur Entrée pour lancer les dés...");
		
	}
	
	public void afficherMessage(String string) {
		System.out.println(string);
		
	}




	

}
