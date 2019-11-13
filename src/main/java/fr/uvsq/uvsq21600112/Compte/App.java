package fr.uvsq.uvsq21600112.Compte;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Compte c1 = new Compte(10000);
    	System.out.print("vous avez ");
        System.out.print(c1.getSolde());
        System.out.println(" euros sur votre compte actuelement");
    }
}
