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
		this.solde = 10000;
	}

	public int getSolde()
	{
		return this.solde;
	}
	
	public int crediter(int credit)
	{
		if(credit > 0)
		{
			return this.solde = this.solde + credit;
		}
		return this.solde;
	}
	
	public int debiter(int credit)
	{
		if(credit > 0 && this.solde - credit > 0)
		{
			return this.solde = this.solde - credit;
		}
		return this.solde;
	}
	
	public void virement(Compte aDebiter,int montantTransaction)
	{
		if(montantTransaction > 0)
		{
			aDebiter.debiter(montantTransaction);
			this.crediter(montantTransaction);
		}
	}

}