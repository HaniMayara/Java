package bean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ProduitBeanTest {
    public static void main(String[] args) {
        ProduitBean produit = new ProduitBean();

        produit.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Propriété changée : " + evt.getPropertyName() + 
                                   ", Valeur ancienne : " + evt.getOldValue() + 
                                   ", Nouvelle valeur : " + evt.getNewValue());
            }
        });

        System.out.println("Valeur initiale de stock : " + produit.getquantiteStock());
        System.out.println("En stock initialement : " + produit.getEnStock());
        produit.augmenter(11);
        System.out.println("Après incrémentation : " + produit.getquantiteStock());
        System.out.println("En stock après incrémentation : " + produit.getEnStock());
        produit.decrementer(10);
        System.out.println("Après décrémentation : " + produit.getquantiteStock());
        System.out.println("En stock après décrémentation : " + produit.getEnStock());
    }
}
