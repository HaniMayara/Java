package bean;

public class ProduitBean2 extends ProduitBean {
    private int limiteMin;
    private int limiteMax;

    public ProduitBean2(int limiteMin, int limiteMax) {
        this.limiteMin = limiteMin;
        this.limiteMax = limiteMax;
    }

    @Override
    public void augmenter(int num) {
        int newValue = getquantiteStock() + num;
        if (newValue <= limiteMax) {
        	setquantiteStock(newValue);
        }
    }

    @Override
    public void decrementer(int num) {
        int newValue = getquantiteStock() - num;
        if (newValue >= limiteMin) {
        	setquantiteStock(newValue);
        }
    }
}
