package affichage;

import joueurs.Pions;
import plateau.Case;
import plateau.Plateau;

public interface Affichage {
	
    void afficherResultatDes(int resultat);

    void afficherTypeCase(Case caseActuelle);

    void afficherPosition(Pions pion);
    
    void afficherEffetCase(String message);
    
    void afficherPlateauGraphique(Plateau plateau, Pions pionAlbert, Pions pionBonno);
    
    void afficherFinDeJeu(Pions gagnant); 
 
	void afficherPV(Pions pion);
	
	void afficherMessage(String string);
	
	void afficherPlateau(Case[] cases);
	
	void lancerDe();

}
