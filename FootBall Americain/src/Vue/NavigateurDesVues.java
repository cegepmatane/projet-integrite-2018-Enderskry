package Vue;
import javafx.application.Application;
import javafx.stage.Stage;
import Controleur.ControleurJoueur;

public class NavigateurDesVues extends Application {

	private VueAjouterJoueur vueAjouterJoueur = null;
	private VueListeJoueur vueListeJoueur = null;
	private VueJoueur vueJoueur = null;
	private VueEditerJoueur vueEditerJoueur = null;
	
	private Stage stade;
	private ControleurJoueur controleur = null;
	
	public NavigateurDesVues()
	{
		this.vueAjouterJoueur = new VueAjouterJoueur();
		this.vueListeJoueur = new VueListeJoueur();
		this.vueJoueur = new VueJoueur();
		this.vueEditerJoueur = new VueEditerJoueur();
	}
	
	@Override
	public void start(Stage stade) throws Exception {
	
	
		this.stade = stade;
		this.stade.setScene(null);
		this.stade.show();
		
		
		
		
		this.controleur = ControleurJoueur.getInstance();
		this.controleur.activerVues(this);
		this.vueAjouterJoueur.setControleur(controleur);
		this.vueListeJoueur.setControleur(controleur);
		this.vueJoueur.setControleur(controleur);
		this.vueEditerJoueur.setControleur(controleur);
	
	}
	
				/*Get*/
	public VueJoueur getVueJoueur()
	{
		return vueJoueur;
	}
	
	public VueListeJoueur getVueListeJoueur()
	{
		return vueListeJoueur;
	}
	
	public VueAjouterJoueur getVueAjouterJoueur()
	{
		return vueAjouterJoueur;
	}
	
	public VueEditerJoueur getVueEditerJoueur()
	{
		return this.vueEditerJoueur;
	}

				/*Navigation*/
	public void naviguerVerVueJoueur()
	{
		stade.setScene(this.vueJoueur);
		stade.show();
	}
	
	public void naviguerVersVueListeJoueur()
	{
		stade.setScene(this.vueListeJoueur);
		stade.show();
	}
	
	public void naviguerVersVueAjouterJoueur()
	{
		stade.setScene(this.vueAjouterJoueur);
		stade.show();
	}
	
	public void naviguerVersVueEditerJoueur()
	{
		stade.setScene(this.vueEditerJoueur);
		stade.show();
	}
	
	
}
