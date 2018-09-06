import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VueAjouterJoueur extends Application {


	protected TextField valeurNom;
	protected TextField valeurNumero;
	protected TextField valeurPoids;
	protected TextField valeurNaissance;
	
	@Override
	public void start(Stage stade) throws Exception {

		VBox panneau = new VBox();	
		GridPane grilleJoueur = new GridPane();
		
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
		panneau.getChildren().add(new Button("Enregistrer"));
		stade.setScene(new Scene(panneau, 400, 400));
		stade.show();		
	
	}
	
	public Joueur demanderJoueur()
	{
		
		Joueur joueur = new Joueur(this.valeurNom.getText(),
									this.valeurNumero.getText(),
									this.valeurPoids.getText(),
									this.valeurNaissance.getText());
		
		return joueur;
		
	}

}
