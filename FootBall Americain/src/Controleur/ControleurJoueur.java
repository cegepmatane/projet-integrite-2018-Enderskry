package Controleur;

import java.util.List;

import Donnee.JoueurDAO;
import Modele.Joueur;
import Vue.NavigateurDesVues;
import Vue.VueAjouterJoueur;
import Vue.VueEditerJoueur;
import Vue.VueJoueur;
import Vue.VueListeJoueur;

public class ControleurJoueur {
	
	private NavigateurDesVues navigateur;
	
	private VueJoueur vueJoueur = null;
	private VueListeJoueur vueListeJoueur = null;
	private VueAjouterJoueur vueAjouterJoueur = null;
	private VueEditerJoueur vueEditerJoueur = null;
	
	JoueurDAO joueurDAO = null;

	
	private ControleurJoueur()
	{
		System.out.println("Lancement du controleur");
		this.joueurDAO = new JoueurDAO();
	}
	
	public void activerVues(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		this.vueJoueur = navigateur.getVueJoueur();
		this.vueListeJoueur = navigateur.getVueListeJoueur();
		this.vueAjouterJoueur = navigateur.getVueAjouterJoueur();
		this.vueEditerJoueur = navigateur.getVueEditerJoueur();
		
		
		
				/*Test*/
 		Joueur joueur = new Joueur("	Alec", "	22", "	59 kg", "	4 Mai 1998");
 		this.vueJoueur.afficherJoueur(joueur);
		
		
		this.navigateur.naviguerVerVueJoueur();
		this.navigateur.naviguerVersVueListeJoueur();
		//this.navigateur.naviguerVersVueAjouterJoueur();
	

		List<Joueur> listeJoueurTest = joueurDAO.listerJoueur();
 		this.vueListeJoueur.afficherListeJoueur(listeJoueurTest);
	
 			
 		
	}
	
	private static ControleurJoueur instance = null;
	public static ControleurJoueur getInstance()
	{
		if(null == instance) instance = new ControleurJoueur();
		return instance;
	}
	
	public void notifierEnregistrerNouveauJoueur()
	{
		System.out.println("Nouveau Joueur Enregistrer");
		Joueur joueur = this.navigateur.getVueAjouterJoueur().demanderJoueur();
		this.joueurDAO.ajouterJoueur(joueur);
		this.vueListeJoueur.afficherListeJoueur(this.joueurDAO.listerJoueur());
		this.navigateur.naviguerVersVueListeJoueur();
	}
	
	public void notifierEnregistrerJoueur()
	{
		System.out.println("Joueur Enregistrer");
		Joueur joueur = this.navigateur.getVueEditerJoueur().demanderJoueur();
		this.joueurDAO.modifierJoueur(joueur);
		this.vueListeJoueur.afficherListeJoueur(this.joueurDAO.listerJoueur());
		this.navigateur.naviguerVersVueListeJoueur();
	}
	
	public void notifierNaviguerAjouterJoueur()
	{
		System.out.println("ControleurJoueur.notifierNaviguerAjouterJoueur()");
		this.navigateur.naviguerVersVueAjouterJoueur();
	}

	public void notifierNettoyerListeJoueur() {
		System.out.println("Nettoyage");
		this.joueurDAO.nettoyerListeJoueur();
		this.vueListeJoueur.afficherListeJoueur(this.joueurDAO.listerJoueur());

	}
	
	public void notifierNaviguerEditerJoueur(int idJoueur)
	{
		this.vueEditerJoueur.afficherJoueur(this.joueurDAO.rapporterJoueur(idJoueur));
		this.navigateur.naviguerVersVueEditerJoueur();
	}

}
