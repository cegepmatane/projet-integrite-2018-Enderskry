import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application {

	private VueAjouterJoueur vueAjouterJoueur;
	
	public NavigateurDesVues()
	{
		this.vueAjouterJoueur = new VueAjouterJoueur();
	}
	@Override
	public void start(Stage stade) throws Exception {
		
		stade.setScene(this.vueAjouterJoueur);
		stade.show();
	}

}
