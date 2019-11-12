package fr.uvsq.uvsq21600112.Compte;

import static org.junit.Assert.*;
import org.junit.*;

public class TestUnitaire {


		@Test
		public void testNotNull()
		{
			Compte cpte = new Compte(1000000);
			assertTrue(cpte.getSolde()>0);
		}
		
		@Test
		public void debiterAvecNegatif()
		{
			Compte cpte = new Compte(10000);
			int soldeAvantDebiter = cpte.getSolde();
			assertEquals(soldeAvantDebiter,cpte.debiter(-100));
		}
		
		@Test
		public void debiterAvecPositif()
		{
			Compte cpte = new Compte(10000);
			Compte cpte2 = new Compte(5000);
			assertEquals(cpte2.getSolde(),cpte.debiter(5000));
		}
		
		
		@Test
		public void crediterAvecNegatif()
		{
			Compte cpte = new Compte(10000);
			int soldeAvantDebiter = cpte.getSolde();
			assertEquals(soldeAvantDebiter,cpte.crediter(-100));
		}
		
		@Test
		public void crediterAvecPositif()
		{
			Compte cpte = new Compte();
			Compte cpte2 = new Compte(15000);
			assertEquals(cpte2.getSolde(),cpte.crediter(5000));
		}
		
		@Test
		public void virementNegatif()
		{
			Compte cpte = new Compte(10000);
			Compte cpte2 = new Compte(15000);
			int soldeAvantVirement = cpte2.getSolde();
			cpte.virement(cpte2, -1000);
			
			assertEquals(soldeAvantVirement,cpte2.getSolde());
		}
		
		@Test
		public void virementPositif()
		{
			Compte cpte = new Compte(10000);
			Compte cpte2 = new Compte(15000);
			
			Compte cpte3 = new Compte(10000);
			cpte.virement(cpte2, 5000);
			assertEquals(cpte2.getSolde(),cpte3.getSolde());
		}

}
