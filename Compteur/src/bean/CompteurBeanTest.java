package bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CompteurBeanTest {
    public static void main(String[] args) {
        CompteurBean compteur = new CompteurBean();

        compteur.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("La valeur a été changée : " + evt.getNewValue());
            }
        });

        // Test d'incrémentation et de décrémentation
        System.out.println("Valeur initiale : " + compteur.getValeur());
        compteur.incrementer();
        System.out.println("Après incrémentation : " + compteur.getValeur());
        compteur.decrementer();
        System.out.println("Après décrémentation : " + compteur.getValeur());
    }
}
