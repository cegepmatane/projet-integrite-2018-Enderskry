import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application {

	private VueAjouterJoueur vueAjouterJoueur;
	private VueListeJoueur vueListeJoueur;
	
	public NavigateurDesVues()
	{
		this.vueAjouterJoueur = new VueAjouterJoueur();
		this.vueListeJoueur = new VueListeJoueur();
	}
	@Override
	public void start(Stage stade) throws Exception {
		
		//stade.setScene(this.vueAjouterJoueur);
		stade.setScene(this.vueListeJoueur);
		stade.show();
	}

}
