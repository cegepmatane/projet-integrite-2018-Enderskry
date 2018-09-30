package Donnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modele.Joueur;

public class JoueurDAO {

	private List<Joueur> simulerListerJoueur()
	{
List<Joueur> listeJoueurTest = new ArrayList<Joueur>();
		
		listeJoueurTest.add(new Joueur("Alec", "	22", "	59 kg", "	4 Mai 1998"));
		listeJoueurTest.add(new Joueur("Lucas", "	12", "	76 kg", "	10 Juillet 1997"));
		listeJoueurTest.add(new Joueur("Antoine", "	2", "	59 kg", "	20 Octobre 1998"));
	//	listeJoueurTest.add(new Joueur("Romain", "	77", "	80 kg", "	5 septembre 1997"));
		return listeJoueurTest;
		
	}
	
		String BASEDEDONNEES_DRIVER = "org.postgresql.Driver";
		String BASEDEDONNEES_URL = "jdbc:postgresql://localhost:5432/postgres";
		String BASEDEDONNEES_USAGER = "postgres";
		String BASEDEDONNEES_MOTDEPASSE = "mimine1998";
		private Connection connection = null;
		
		public JoueurDAO()
		{
			
		try {
			Class.forName(BASEDEDONNEES_DRIVER);
		}catch (ClassNotFoundException e) 
		{			
			e.printStackTrace();
		}
		
		try {

			connection = DriverManager.getConnection(BASEDEDONNEES_URL, BASEDEDONNEES_USAGER, BASEDEDONNEES_MOTDEPASSE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Joueur> listerJoueur()
	{
 		List<Joueur> listeJoueur =  new ArrayList<Joueur>();			
		Statement requeteListeJoueur;
		try {
			requeteListeJoueur = connection.createStatement();
			
			ResultSet curseurListeJoueur = requeteListeJoueur.executeQuery("SELECT * FROM joueur");
			
			while(curseurListeJoueur.next())
			{
				String nom = curseurListeJoueur.getString("nom");
				String numero = curseurListeJoueur.getString("numero");
				String poids = curseurListeJoueur.getString("poids");
				String naissance = curseurListeJoueur.getString("naissance");
				System.out.println("Joueur " + nom + " nee le " + naissance + " poids: " + poids +" kg " +" numero: " + numero);
				Joueur joueur = new Joueur(nom, numero, poids, naissance);
				listeJoueur.add(joueur);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listeJoueur;
	}
	
	
	
}
