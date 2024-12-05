package bean;

public class CompteurBean2 extends CompteurBean {
    private int limiteMin;
    private int limiteMax;

    public CompteurBean2(int limiteMin, int limiteMax) {
        this.limiteMin = limiteMin;
        this.limiteMax = limiteMax;
    }

    @Override
    public void incrementer() {
        int newValue = getValeur() + 1;
        if (newValue <= limiteMax) {
            setValeur(newValue);
        }
    }

    @Override
    public void decrementer() {
        int newValue = getValeur() - 1;
        if (newValue >= limiteMin) {
            setValeur(newValue);
        }
    }
}
