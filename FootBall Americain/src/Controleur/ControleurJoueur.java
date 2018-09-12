package Controleur;

import java.util.ArrayList;
import java.util.List;

import Donnee.JoueurDAO;
import Modele.Joueur;
import Vue.NavigateurDesVues;
import Vue.VueAjouterJoueur;
import Vue.VueJoueur;
import Vue.VueListeJoueur;

public class ControleurJoueur {
	
	private NavigateurDesVues navigateur;
	
	private VueJoueur vueJoueur;
	private VueListeJoueur vueListeJoueur;
	private VueAjouterJoueur vueAjouterJoueur;
	
	private ControleurJoueur()
	{
		System.out.println("Lancement du controleur");
	}
	
	public void activerVues(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		this.vueJoueur = navigateur.getVueJoueur();
		this.vueListeJoueur = navigateur.getVueListeJoueur();
		this.vueAjouterJoueur = navigateur.getVueAjouterJoueur();
		
		
		
				/*Test*/
 		Joueur joueur = new Joueur("	Alec", "	22", "	59 kg", "	4 Mai 1998");
 		this.vueJoueur.afficherMouton(joueur);
		
		
		this.navigateur.naviguerVerVueJoueur();
		this.navigateur.naviguerVersVueListeJoueur();
		//this.navigateur.naviguerVersVueAjouterJoueur();
	

		JoueurDAO joueurDAO = new JoueurDAO();
		List<Joueur> listeJoueurTest = joueurDAO.listerJoueur();
 		this.vueListeJoueur.afficherListeJoueur(listeJoueurTest);
	
 			
 		
	}
	
	private static ControleurJoueur instance = null;
	public static ControleurJoueur getInstance()
	{
		if(null == instance) instance = new ControleurJoueur();
		return instance;
	}
	

}
