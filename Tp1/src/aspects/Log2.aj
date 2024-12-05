package aspects;

import metier.CompteBancaire;

public aspect Log2 {


		pointcut logOperation(CompteBancaire c) 
		: call ( void metier.CompteBancaire.retirer(double)) && target(c);

		before(CompteBancaire c) : logOperation(c) { 
			System.out.println("********* AVANT l'opération ***********");
			System.out.println(c.toString());
		} 

		after(CompteBancaire c) : logOperation(c) { 
		System.out.println("*********** APRES l'opération *********** "); 
		System.out.println(c.toString());
		} 

}
