import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VueListeJoueur extends Application{
		
	private GridPane grilleJoueur = null;

	@Override
	public void start(Stage stade) throws Exception {

		Pane panneau = new Pane();	
		grilleJoueur = new GridPane();
		
		panneau.getChildren().add(grilleJoueur);
		stade.setScene(new Scene(panneau, 400, 400));
		
		List<Joueur> listeJoueurTest = new ArrayList<Joueur>();
		
		listeJoueurTest.add(new Joueur("Alec", "	22", "	59 kg", "	4 Mai 1998"));
		listeJoueurTest.add(new Joueur("Lucas", "	12", "	76 kg", "	10 Juillet 1997"));
		listeJoueurTest.add(new Joueur("Antoine", "	2", "	60 kg", "	20 Octobre 1998"));
		listeJoueurTest.add(new Joueur("Romain", "	77", "	80 kg", "	5 septembre 1997"));
 		this.afficherListeJoueur(listeJoueurTest); 
 		
 		stade.show();
		
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