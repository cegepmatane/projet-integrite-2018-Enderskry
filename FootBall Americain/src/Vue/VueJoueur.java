package Vue;
import Modele.Joueur;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class VueJoueur extends Scene {
	
	protected Label valeurNom;
	protected Label valeurNumero;
	protected Label valeurNaissance;
	protected Label valeurPoids;

	public VueJoueur()
	{
		super(new GridPane(), 400, 400);
		GridPane grilleJoueur =  (GridPane) this.getRoot();
 
 		
 		valeurNom = new Label("Alec");
 		grilleJoueur.add(new Label("Nom : "), 0, 0);
 		grilleJoueur.add(valeurNom, 1, 0);
 		
 		valeurNumero = new Label("22");
 		grilleJoueur.add(new Label("Numero : "), 0, 1);
 		grilleJoueur.add(valeurNumero, 1, 1);
 
 		valeurNaissance = new Label("4 Mai 1998");
 		grilleJoueur.add(new Label("Naissance : "), 0, 2);
 		grilleJoueur.add(valeurNaissance, 1, 2);				
 		
 		valeurPoids = new Label("59 kg");
 		grilleJoueur.add(new Label("Poids : "), 0, 3);
 		grilleJoueur.add(valeurPoids, 1, 3);		
 	

	}
	
	public void afficherMouton(Joueur joueur)
	{
		this.valeurNom.setText(joueur.getNom());
		this.valeurNumero.setText(joueur.getNumero());
		this.valeurPoids.setText(joueur.getPoids());
		this.valeurNaissance.setText(joueur.getNaissance());
		
	}
}
