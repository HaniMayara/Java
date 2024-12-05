package bean;

public class CompteurBeanTest2 {
    public static void main(String[] args) {
    	ProduitBean2 produit = new ProduitBean2(5, 50);

        // Ajout d'un écouteur pour surveiller les changements de la propriété "valeur"
    	produit.addPropertyChangeListener(evt -> System.out.println("La valeur a été changée : " + evt.getNewValue()));

        // Test d'incrémentation et de décrémentation
        System.out.println("Valeur initiale : " + produit.getquantiteStock());
        produit.augmenter(10);
        System.out.println("Après incrémentation : " + produit.getquantiteStock());
        produit.decrementer(5);
        System.out.println("Après décrémentation : " + produit.getquantiteStock());

        // Test de débordement
        for (int i = 0; i < 15; i++) {
        	produit.augmenter(5);
            System.out.println("Incrémentation : " + produit.getquantiteStock());
        }
        for (int i = 0; i < 30; i++) {
        	produit.decrementer(5);
            System.out.println("Decrémentation : " + produit.getquantiteStock());
        }
        
    }
}
