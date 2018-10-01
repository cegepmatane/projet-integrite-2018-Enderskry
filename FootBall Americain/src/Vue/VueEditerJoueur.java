package Vue;

import Controleur.ControleurJoueur;
import Modele.Joueur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class VueEditerJoueur extends Scene {
	
	protected TextField valeurNom;
	protected TextField valeurNumero;
	protected TextField valeurPoids;
	protected TextField valeurNaissance;
	
	private ControleurJoueur controleur = null;
	protected Button actionEnregistrerJoueur = null;
	GridPane grilleListePalmares = new GridPane();
	
	private int id_joueur = 0;
	
	public VueEditerJoueur()  
	{
		super(new VBox(), 500, 500);
		VBox panneau = (VBox) this.getRoot();
		GridPane grilleJoueur = new GridPane();
		this.actionEnregistrerJoueur = new Button("Enregistrer");
		
		this.actionEnregistrerJoueur.setOnAction(new EventHandler<ActionEvent>() {
 			@Override
			public void handle(ActionEvent arg0) {
				
				controleur.notifierEnregistrerJoueur();
				
			}});
		
		valeurNom = new TextField();
		grilleJoueur.add(new Label("Nom : "), 0, 0);
		grilleJoueur.add(valeurNom, 1, 0);
		
		valeurNaissance = new TextField("");
		grilleJoueur.add(new Label("Naissance : "), 0, 1);
		grilleJoueur.add(valeurNaissance, 1, 1);
		
		
	
		valeurPoids = new TextField("");
		grilleJoueur.add(new Label("Poids : "), 0, 2);
		grilleJoueur.add(valeurPoids, 1, 2);	
		
		valeurNumero = new TextField("");
		grilleJoueur.add(new Label("Numero : "), 0, 3);
		grilleJoueur.add(valeurNumero, 1, 3);	
		
		this.grilleListePalmares.add(new Label("Palmares 1"), 0 ,0);
		this.grilleListePalmares.add(new Label("Palmares 2"), 0 ,1);
		this.grilleListePalmares.add(new Label("Palmares 3"), 0 ,2);
		this.grilleListePalmares.add(new Label("Palmares 4"), 0 ,3);

			
		panneau.getChildren().add(new Label("Editer un joueur")); 
		panneau.getChildren().add(grilleJoueur);
		panneau.getChildren().add(this.actionEnregistrerJoueur);
		panneau.getChildren().add(grilleListePalmares);
		
	}
	
	public void afficherJoueur(Joueur joueur)
	{
		this.id_joueur = joueur.getId();
		this.valeurNom.setText(joueur.getNom());
		this.valeurPoids.setText(joueur.getPoids());
		this.valeurNaissance.setText(joueur.getNaissance());
		this.valeurNumero.setText(joueur.getNumero());
	}
	

	public Joueur demanderJoueur()
	{
		Joueur joueur = new Joueur(this.valeurNom.getText(),  
								this.valeurPoids.getText(), 
								this.valeurNaissance.getText(),
								this.valeurNumero.getText());
		joueur.setId(id_joueur);
		return joueur;
	}
	
	public void setControleur(ControleurJoueur controleur) {
		this.controleur = controleur;
	}

}
