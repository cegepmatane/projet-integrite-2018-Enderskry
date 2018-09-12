package Controleur;

import Vue.NavigateurDesVues;

public class ControleurJoueur {
	
	private NavigateurDesVues navigateur;
	
	public ControleurJoueur(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		System.out.println("Lancement du controleur");
	}

}
