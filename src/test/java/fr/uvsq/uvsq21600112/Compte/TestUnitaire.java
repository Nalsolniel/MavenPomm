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

}
