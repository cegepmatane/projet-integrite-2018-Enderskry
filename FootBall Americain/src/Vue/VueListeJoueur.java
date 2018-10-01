package Vue;
import java.util.List;

import Controleur.ControleurJoueur;
import Modele.Joueur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class VueListeJoueur extends Scene{
		
	protected GridPane grilleJoueur;
	
	private ControleurJoueur controleur = null;
	
	private Button actionNaviguerAjouterJoueur;
	private Button actionNettoyerListeJoueur;

	public VueListeJoueur() {
		super(new GridPane(), 500, 500);
		grilleJoueur =  (GridPane) this.getRoot();	
		this.actionNaviguerAjouterJoueur = new Button("Ajouter un joueur");
		this.actionNettoyerListeJoueur = new Button("Nettoyer Liste");
	}
	
	public void afficherListeJoueur(List<Joueur> listeJoueur)
	{
		
		this.grilleJoueur.getChildren().clear();	//Vider la liste d'affichage avant de reafficher
		
		int numero = 0;
		this.grilleJoueur.add(new Label("Nom"), 0 , numero);
		this.grilleJoueur.add(new Label("	Naissance"), 1, numero);
		this.grilleJoueur.add(new Label("Poids"), 2, numero);
		this.grilleJoueur.add(new Label("	Numero"), 3, numero);
		for(Joueur joueur : listeJoueur)
		{
			Button actionEditerJoueur = new Button("Editer");
			actionEditerJoueur.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					controleur.notifierNaviguerEditerJoueur(joueur.getId());
				}});
			numero++;
			this.grilleJoueur.add(new Label(joueur.getNom()), 0, numero);
			this.grilleJoueur.add(new Label(joueur.getPoids()), 2, numero);
			this.grilleJoueur.add(new Label(joueur.getNaissance()), 1, numero);
			this.grilleJoueur.add(new Label(joueur.getNumero()), 3, numero);
			this.grilleJoueur.add(actionEditerJoueur, 5, numero);

		}
	this.actionNaviguerAjouterJoueur.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			controleur.notifierNaviguerAjouterJoueur();
		}
		
	});
	
		this.grilleJoueur.add(this.actionNaviguerAjouterJoueur, 1, ++numero);
		
		this.actionNettoyerListeJoueur.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				controleur.notifierNettoyerListeJoueur();
			}
			
		});
		this.grilleJoueur.add(this.actionNettoyerListeJoueur, 1, ++numero);
	}
	

	
	
	public void setControleur(ControleurJoueur controleur) {
		this.controleur = controleur;
	}

}
