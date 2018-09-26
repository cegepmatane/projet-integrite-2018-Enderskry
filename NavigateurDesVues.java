package Vue;
import javafx.application.Application;
import javafx.stage.Stage;
import Controleur.ControleurJoueur;

public class NavigateurDesVues extends Application {

	private VueAjouterJoueur vueAjouterJoueur = null;
	private VueListeJoueur vueListeJoueur = null;
	private VueJoueur vueJoueur = null;
	private Stage stade;
	private ControleurJoueur controleur = null;
	
	public NavigateurDesVues()
	{
		this.vueAjouterJoueur = new VueAjouterJoueur();
		this.vueListeJoueur = new VueListeJoueur();
		this.vueJoueur = new VueJoueur();
		

		
 		
	}
	@Override
	public void start(Stage stade) throws Exception {
	
	
		this.stade = stade;
		this.stade.setScene(null);
		this.stade.show();
		
		
		/*Test*/
		this.naviguerVersVueListeJoueur();
		this.naviguerVerVueJoueur();
		this.naviguerVersVueAjouterJoueur();
		this.controleur = ControleurJoueur.getInstance();
		this.controleur.activerVues(this);

		
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
	
	
}
