package Vue;
import java.util.List;

import Modele.Joueur;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class VueListeJoueur extends Scene{
		
	protected GridPane grilleJoueur;


	public VueListeJoueur() {
		super(new GridPane(), 400, 400);
		grilleJoueur =  (GridPane) this.getRoot();	
	
	}
	
	public void afficherListeJoueur(List<Joueur> listeJoueur)
	{
		
		this.grilleJoueur.getChildren().clear();	//Vider la liste d'affichage avant de reafficher
		
		int numero = 0;
		this.grilleJoueur.add(new Label("Nom"), 0 , numero);
		this.grilleJoueur.add(new Label("	Naissance"), 1, numero);
		this.grilleJoueur.add(new Label("	Poids"), 2, numero);
		this.grilleJoueur.add(new Label("	Numero"), 3, numero);
		for(Joueur joueur : listeJoueur)
		{
			numero++;
			this.grilleJoueur.add(new Label(joueur.getNom()), 0, numero);
			this.grilleJoueur.add(new Label(joueur.getPoids()), 1, numero);
			this.grilleJoueur.add(new Label(joueur.getNaissance()), 2, numero);
			this.grilleJoueur.add(new Label(joueur.getNumero()), 3, numero);
		}
	}

}
