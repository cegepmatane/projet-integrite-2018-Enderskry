package Modele;

public class Palmares {
	protected String titre;
	protected String numero_joueur;
	protected String date;
	
	public Palmares(String titre) 
	{
		this.titre = titre;
	}
	
	public Palmares(String titre, String numero_joueur) 
	{
		this.titre = titre;
		this.numero_joueur = numero_joueur;
	}
	
	public Palmares(String titre, String numero_joueur, String date) 
	{
		this.titre = titre;
		this.numero_joueur = numero_joueur;
		this.date = date;
	}
	
			/*GET*/
	public String getTitre()
	{
		return titre;
	}
	
	public String getNumero_Joueur()
	{
		return numero_joueur;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setTitre()
	{
		this.titre = titre;
	}
	
	public void setNumero_Joueur()
	{
		this.numero_joueur = numero_joueur;
	}
	
	public void setDate()
	{
		this.date = date;
	}

}
