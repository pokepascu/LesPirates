package jeu;



import java.util.Scanner;



import affichage.Affichage;
import joueurs.Couleurs;
import joueurs.Pions;
import plateau.Case;
import plateau.Plateau;



public class Jeu {
	
	private De de;
    private Plateau plateau;
    private Pions pionAlbert;
    private Pions pionBonno;
    private Scanner scanner;
    private Affichage affichage; 
    private int nbCases = 30;
    
    
    public Jeu() {
    	de = new De();
        plateau = new Plateau(nbCases);
        pionAlbert = new Pions("Albert le beau", Couleurs.ROUGE);
        pionBonno = new Pions("Bonno l'artiste", Couleurs.BLEU);
        scanner = new Scanner(System.in);
        affichage = new Affichage();
    }
    
    
    private void tourPion(Pions pion, Pions adversaire) {
    	String deplacement;
        affichage.lancerDe();
        scanner.nextLine();
        
        int res = de.resultatDes();
        affichage.afficherResultatDes(res); 
        
        deplacement = pion.deplacer(res);
        if (deplacement != null) {
            affichage.afficherMessage(deplacement);
        }
        
        Case caseActuelle = plateau.getCases()[pion.getPosition()];
        affichage.afficherTypeCase(caseActuelle);
        affichage.afficherEffetCase(caseActuelle.effet(pion, adversaire, plateau));


        affichage.afficherPosition(pion); 
        affichage.afficherPV(pion);
    }
    
    
    private void jouerTour() {
        tourPion(pionAlbert, pionBonno);
        if (estTermine(pionAlbert) || estMort(pionAlbert)) {
            return;
        }
        
        tourPion(pionBonno, pionAlbert);
    }
    
    
    private boolean estMort(Pions pion) {
        if (pion.getVie() <= 0) {
            affichage.afficherMessage(pion.getNom() + " est mort !");
            return true;
        }
        return false;
    }

    private boolean estTermine(Pions pion) {
        if (pion.getPosition() >= nbCases-1) {
            return true;
        }
        return false;
    }
    
    public void commencerJeu() {
        affichage.afficherPlateau(plateau.getCases());
        while (!estTermine(pionAlbert) && !estTermine(pionBonno) && pionAlbert.getVie() > 0 && pionBonno.getVie() > 0) {
            jouerTour();
            affichage.afficherPlateauGraphique(plateau, pionAlbert, pionBonno);
        }
        
        if (estTermine(pionAlbert) || pionBonno.getVie() <= 0) {
            affichage.afficherFinDeJeu(pionAlbert);
        } else if (estTermine(pionBonno) || pionAlbert.getVie() <= 0) {
            affichage.afficherFinDeJeu(pionBonno);
        }
    }

}
