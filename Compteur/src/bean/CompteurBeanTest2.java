package bean;

public class CompteurBeanTest2 {
    public static void main(String[] args) {
        CompteurBean2 compteur = new CompteurBean2(0, 10);

        // Ajout d'un écouteur pour surveiller les changements de la propriété "valeur"
        compteur.addPropertyChangeListener(evt -> System.out.println("La valeur a été changée : " + evt.getNewValue()));

        // Test d'incrémentation et de décrémentation
        System.out.println("Valeur initiale : " + compteur.getValeur());
        compteur.incrementer();
        System.out.println("Après incrémentation : " + compteur.getValeur());
        compteur.decrementer();
        System.out.println("Après décrémentation : " + compteur.getValeur());

        // Test de débordement
        for (int i = 0; i < 15; i++) {
            compteur.incrementer();
            System.out.println("Incrémentation : " + compteur.getValeur());
        }
        for (int i = 0; i < 30; i++) {
            compteur.decrementer();
            System.out.println("Decrémentation : " + compteur.getValeur());
        }
        
    }
}
