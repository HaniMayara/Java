package application;

import metier.CompteBancaire;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompteBancaire c = new CompteBancaire(1, 2000.0);

		c.retirer(1050.0);

	}

}
