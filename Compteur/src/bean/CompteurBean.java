package bean;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CompteurBean {
    private int valeur;
    private String nom;
    private PropertyChangeSupport support;

    public CompteurBean() {
        support = new PropertyChangeSupport(this);
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        int oldValue = this.valeur;
        this.valeur = valeur;
        support.firePropertyChange("valeur", oldValue, this.valeur);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void incrementer() {
        setValeur(getValeur() + 1);
    }

    public void decrementer() {
        setValeur(getValeur() - 1);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
