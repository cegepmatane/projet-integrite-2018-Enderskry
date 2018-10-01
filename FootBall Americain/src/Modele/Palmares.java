package Modele;

import java.util.Calendar;

public class Palmares {
	protected int id;
	protected String titre;
	protected String numero_joueur;
	protected int date;
	
	public Palmares()
	{
		this.date = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public Palmares(String titre) 
	{
		this.titre = titre;
	}
	
	public Palmares(String titre, String numero_joueur) 
	{
		this.titre = titre;
		this.numero_joueur = numero_joueur;
	}
	
	public Palmares(String titre, String numero_joueur, int date) 
	{
		this.titre = titre;
		this.numero_joueur = numero_joueur;
		this.date = date;
	}
	
			/*GET*/
	public int getId()
	{
		return id;
	}
	
	public String getTitre()
	{
		return titre;
	}
	
	public String getNumero_Joueur()
	{
		return numero_joueur;
	}
	
	public int getDate()
	{
		return date;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setTitre(String titre)
	{
		this.titre = titre;
	}
	
	public void setNumero_Joueur(String numero_joueur)
	{
		this.numero_joueur = numero_joueur;
	}
	
	public void setDate(int date)
	{
		this.date = date;
	}

}
