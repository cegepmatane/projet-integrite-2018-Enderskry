import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VueJoueur extends Application {
	
	/*Label valeurNom;
	Label valeurNumero;
	Label valeurNaissance;
	Label valeurPoids;*/

	@Override
	public void start(Stage stade) throws Exception {
		
		Pane panneau = new Pane();	
 		GridPane grilleJoueur = new GridPane();
 
 		
 		Label valeurNom = new Label("Alec");
 		grilleJoueur.add(new Label("Nom : "), 0, 0);
 		grilleJoueur.add(valeurNom, 1, 0);
 		
 		Label valeurNumero = new Label("22");
 		grilleJoueur.add(new Label("Numero : "), 0, 1);
 		grilleJoueur.add(valeurNumero, 1, 1);
 
 		Label valeurNaissance = new Label("4 Mai 1998");
 		grilleJoueur.add(new Label("Naissance : "), 0, 2);
 		grilleJoueur.add(valeurNaissance, 1, 2);				
 		
 		Label valeurPoids = new Label("59 kg");
 		grilleJoueur.add(new Label("Poids : "), 0, 3);
 		grilleJoueur.add(valeurPoids, 1, 3);		
 	
		panneau.getChildren().add(grilleJoueur);
		stade.setScene(new Scene(panneau, 400, 400));
		stade.show();
		

	}
	
	/*public void afficherMouton(Joueur joueur)
	{
		
		
	
 
		
	}*/

}
