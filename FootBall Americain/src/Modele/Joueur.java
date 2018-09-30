package Modele;

public class Joueur {
	protected int id_joueur;
	protected String nom;
 	protected String numero;
	protected String naissance;
	protected String poids;
	
	
	public Joueur(String nom) {
		super();
		this.nom = nom;
	}
	public Joueur(String nom, String numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}
	public Joueur(String nom, String numero, String naissance, String poids) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.naissance = naissance;
		this.poids = poids;
	}
	
			/*GET*/
	public String getNom() 
	{
		return nom;
	}
	
 	public String getNumero() 
 	{
 		return numero;
 	}
 	
 	public String getNaissance() 
 	{
 		return naissance;
 	}
 	
	public String getPoids() 
 	{
 		return poids;
 	}
	
	public int getId()
	{
		return id_joueur;
	}
 				/*SET*/
 	public void setNumero(String numero) 
 	{
 		this.numero = numero;
 	}

 	public void setNaissance(String naissance) 
 	{
 		this.naissance = naissance;
 	}
 	
	public void setNom(String nom) 
 	{
 		this.nom = nom;
 	}
 	
 	public void setPoids(String poids) {
 		this.poids = poids;
 	}
 	
 	public void setId(int id_joueur)
 	{
 		this.id_joueur = id_joueur;
 	}
}
