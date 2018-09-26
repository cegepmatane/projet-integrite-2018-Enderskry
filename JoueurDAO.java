package Donnee;

import java.util.ArrayList;
import java.util.List;

import Modele.Joueur;

public class JoueurDAO {

	private List<Joueur> simulerListerJoueur()
	{
List<Joueur> listeJoueurTest = new ArrayList<Joueur>();
		
		listeJoueurTest.add(new Joueur("Alec", "	22", "	59 kg", "	4 Mai 1998"));
		listeJoueurTest.add(new Joueur("Lucas", "	12", "	76 kg", "	10 Juillet 1997"));
		listeJoueurTest.add(new Joueur("Antoine", "	2", "	59 kg", "	20 Octobre 1998"));
		listeJoueurTest.add(new Joueur("Romain", "	77", "	80 kg", "	5 septembre 1997"));
		return listeJoueurTest;
		
	}
	
	public List<Joueur> listerJoueur()
	{
		return this.simulerListerJoueur();
	}
	
}
