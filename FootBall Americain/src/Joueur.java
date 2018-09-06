
public class Joueur {
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
	public String getNom() {
		return nom;
	}
	
 	public void setNom(String nom) {
 		this.nom = nom;
 	}
 	public String getNumero() {
 		return numero;
 	}
 	public void setNumero(String numero) {
 		this.numero = numero;
 	}
 	public String getNaissance() {
 		return naissance;
 	}
 	public void setNaissance(String naissance) {
 		this.naissance = naissance;
 	}
 	public String getPoids() {
 		return poids;
 	}
 	public void setPoids(String poids) {
 		this.poids = poids;
 	}
}
