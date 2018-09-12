import java.util.ArrayList;
import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class VueListeJoueur extends Scene{
		
	private GridPane grilleJoueur = null;


	public VueListeJoueur() {
		super(new VBox(), 400, 400);
		Pane panneau =  (Pane) this.getRoot();	
		grilleJoueur = new GridPane();
		
		panneau.getChildren().add(grilleJoueur);
		
		 
 		
 		
		
	}
	
	public void afficherListeJoueur(List<Joueur> listeJoueur)
	{
		
		
		this.grilleJoueur.getChildren().clear();
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
