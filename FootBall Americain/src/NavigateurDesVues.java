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
	}
	@Override
	public void start(Stage stade) throws Exception {
	
		stade.setScene(this.vueAjouterJoueur);
		stade.setScene(this.vueListeJoueur);
		stade.setScene(this.vueJoueur);
		stade.show();
	}

}
