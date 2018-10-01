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
		String BASEDEDONNEES_MOTDEPASSE = "admin";
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
				int id_joueur = curseurListeJoueur.getInt("id_joueur");
				String nom = curseurListeJoueur.getString("nom");
				String poids = curseurListeJoueur.getString("poids");
				String naissance = curseurListeJoueur.getString("naissance");
				String numero = curseurListeJoueur.getString("numero");
				System.out.println("Joueur " + nom + " nee le " + naissance + " poids: " + poids +" kg " +" numero: " + numero);
				Joueur joueur = new Joueur(nom, poids, naissance, numero);
				joueur.setId(id_joueur);
				listeJoueur.add(joueur);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listeJoueur;
	}
	
	
	public void ajouterJoueur(Joueur joueur)
	{
		System.out.println("Ajouter Joueur");
		try {
			Statement requeteAjouterJoueur = connection.createStatement();
			
			String sqlAjouterJoueur = "INSERT into joueur(nom, poids, naissance, numero ) VALUES('"+joueur.getNom() +"','"+joueur.getPoids() +"','"+joueur.getNaissance()+"','" +joueur.getNumero()+"')";
			System.out.println("SQL : " + sqlAjouterJoueur);
			requeteAjouterJoueur.execute(sqlAjouterJoueur);

		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void nettoyerListeJoueur() 
	{
		System.out.println("Nettoyer Liste");

		try {
			Statement requeteNettoyerListeJoueur = connection.createStatement();
			
			String sqlNettoyerListeJoueur = "DELETE FROM joueur";
			requeteNettoyerListeJoueur.execute(sqlNettoyerListeJoueur);
	
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void modifierJoueur(Joueur joueur)
	{
		System.out.println("Modifier Joueur");
		try {
			Statement requeteModifierJoueur = connection.createStatement();
			String sqlModifierJoueur = "UPDATE joueur SET nom = '"+joueur.getNom()+"', poids = '"+joueur.getPoids()+"', naissance = '"+joueur.getNaissance()+"', numero = '"+joueur.getNumero()+"' WHERE id_joueur = " + joueur.getId();
			System.out.println("SQL : " + sqlModifierJoueur);
			requeteModifierJoueur.execute(sqlModifierJoueur);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Joueur rapporterJoueur(int idJoueur)
	{
		Statement requeteJoueur;
		try {
			requeteJoueur = connection.createStatement();
			String SQL_RAPPORTER_JOUEUR = "SELECT * FROM joueur WHERE id_joueur = " + idJoueur;

			ResultSet curseurJoueur = requeteJoueur.executeQuery(SQL_RAPPORTER_JOUEUR);
			curseurJoueur.next();
			int id_joueur = curseurJoueur.getInt("id_joueur");
			String nom = curseurJoueur.getString("nom");
			String poids = curseurJoueur.getString("poids");
			String naissance = curseurJoueur.getString("naissance");
			String numero = curseurJoueur.getString("numero");

			Joueur joueur = new Joueur(nom, poids, naissance,numero );
			joueur.setId(id_joueur);
			return joueur;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
