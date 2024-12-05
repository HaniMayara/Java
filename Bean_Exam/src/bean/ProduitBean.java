package bean;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ProduitBean {
    private int quantiteStock;
    private String nomProduit;
    private boolean enStock;
    private PropertyChangeSupport support;

    public ProduitBean() {
        support = new PropertyChangeSupport(this);
        enStock = false; // Initialement, supposons que le produit n'est pas en stock
    }

    public int getquantiteStock() {
        return quantiteStock;
    }

    public void setquantiteStock(int quantiteStock) {
        int oldValue = this.quantiteStock;
        this.quantiteStock = quantiteStock;
        support.firePropertyChange("quantiteStock", oldValue, this.quantiteStock);
        setEnStock(this.quantiteStock > 0); // Mise à jour de enStock basé sur la nouvelle quantité
    }

    public String getnomProduit() {
        return nomProduit;
    }

    public void setnomProduit(String nom) {
        this.nomProduit = nom;
    }

    public boolean getEnStock() {
        return enStock;
    }

    public void setEnStock(boolean newEnStock) {
        boolean oldEnStock = this.enStock;
        this.enStock = newEnStock;
        support.firePropertyChange("enStock", oldEnStock, this.enStock);
    }

    public void augmenter(int num) {
    	setquantiteStock(getquantiteStock() + num);
    }

    public void decrementer(int num) {
    	setquantiteStock(getquantiteStock() - num);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
