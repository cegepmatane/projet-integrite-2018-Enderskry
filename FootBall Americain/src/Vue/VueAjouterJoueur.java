package Vue;
import Modele.Joueur;
import Controleur.ControleurJoueur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class VueAjouterJoueur extends Scene {


	protected TextField valeurNom;
	protected TextField valeurNumero;
	protected TextField valeurPoids;
	protected TextField valeurNaissance;
	
	private ControleurJoueur controleur = null;
	protected Button actionEnregistrerJoueur = null;
	
	
	public VueAjouterJoueur() 
	{
		super(new VBox(), 400, 400);
		VBox panneau = (VBox) this.getRoot();	
		GridPane grilleJoueur = new GridPane();
		this.actionEnregistrerJoueur = new Button("Enregistrer");
		
		this.actionEnregistrerJoueur.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				controleur.notifierEnregistrerJoueur();

			}
			
		});
		
		valeurNom = new TextField();
		grilleJoueur.add(new Label("Nom : "), 0, 0);
		grilleJoueur.add(valeurNom, 1, 0);
		
		valeurNumero = new TextField("");
		grilleJoueur.add(new Label("Numero : "), 0, 1);
		grilleJoueur.add(valeurNumero, 1, 1);
	
		valeurPoids = new TextField("");
		grilleJoueur.add(new Label("Poids : "), 0, 2);
		grilleJoueur.add(valeurPoids, 1, 2);	
		
		valeurNaissance = new TextField("");
		grilleJoueur.add(new Label("Naissance : "), 0, 3);
		grilleJoueur.add(valeurNaissance, 1, 3);
		
		panneau.getChildren().add(new Label("Ajouter un joueur"));
		panneau.getChildren().add(grilleJoueur);
		panneau.getChildren().add(this.actionEnregistrerJoueur);
				
	
	}
	
	public Joueur demanderJoueur() //Recupere les valeurs données par l'utilisateur
	{
		
		Joueur joueur = new Joueur(this.valeurNom.getText(),
									this.valeurNumero.getText(),
									this.valeurPoids.getText(),
									this.valeurNaissance.getText());
		
		return joueur;
		
	}
	
	public void setControleur(ControleurJoueur controleur) {
		this.controleur = controleur;
	}

}
