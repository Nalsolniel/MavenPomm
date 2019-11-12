package fr.uvsq.uvsq21600112.Compte;


public class Compte
{

	private int solde;

	public Compte(int a)
	{
		this.solde = a;
	}

	public Compte()
	{
		this.solde = 9999999;
	}

	public int getSolde()
	{
		return this.solde;
	}


}