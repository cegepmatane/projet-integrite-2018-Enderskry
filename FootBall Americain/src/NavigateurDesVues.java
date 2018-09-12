import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application {

	private VueAjouterJoueur vueAjouterJoueur;
	private VueListeJoueur vueListeJoueur;
	private VueJoueur vueJoueur;
	
	public NavigateurDesVues()
	{
		this.vueAjouterJoueur = new VueAjouterJoueur();
		this.vueListeJoueur = new VueListeJoueur();
		this.vueJoueur = new VueJoueur();
		

		List<Joueur> listeJoueurTest = new ArrayList<Joueur>();
		
		listeJoueurTest.add(new Joueur("Alec", "	22", "	59 kg", "	4 Mai 1998"));
		listeJoueurTest.add(new Joueur("Lucas", "	12", "	76 kg", "	10 Juillet 1997"));
		listeJoueurTest.add(new Joueur("Antoine", "	2", "	59 kg", "	20 Octobre 1998"));
		listeJoueurTest.add(new Joueur("Romain", "	77", "	80 kg", "	5 septembre 1997"));
 		this.vueListeJoueur.afficherListeJoueur(listeJoueurTest);
 		
 		Joueur joueur = new Joueur("	Alec", "	22", "	59 kg", "	4 Mai 1998");
 		this.vueJoueur.afficherMouton(joueur);
	}
	@Override
	public void start(Stage stade) throws Exception {
	
	//	stade.setScene(this.vueAjouterJoueur);
		//stade.setScene(this.vueListeJoueur);
		stade.setScene(this.vueJoueur);
		stade.show();
	}

}
