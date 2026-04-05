package lab05;

public class DistributoreAutomatico {
    private Prodotto[] prodotti;
    private double saldo;

    public DistributoreAutomatico(int n) {
        this.prodotti = new Prodotto[n];
        this.saldo = 0.0;
    }
    
    public void carica() {
        for (int i = 0; i < prodotti.length; i++) {
            double r = Math.random();
            if (r < 0.33) prodotti[i] = new BottigliaDAcqua();
            else if (r < 0.66) prodotti[i] = new BarraDiCioccolato();
            else prodotti[i] = new GommeDaMasticare();
        }
    }

    public void inserisciImporto(double importo) {
        this.saldo += importo;
    }

    public Prodotto getProdotto(String id) {
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i] != null && prodotti[i].getId().equals(id)) {
                if (saldo >= prodotti[i].getPrezzo()) {
                    saldo -= prodotti[i].getPrezzo();
                    Prodotto p = prodotti[i];
                    prodotti[i] = null;
                    return p;
                }
            }
        }
        return null;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getResto() {
        double resto = saldo;
        saldo = 0.0;
        return resto;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i] == null) s += "VUOTO\n";
            else s += prodotti[i].toString() + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        DistributoreAutomatico da = new DistributoreAutomatico(5);
        da.carica();
        System.out.println("Stato iniziale: \n" + da);

        da.inserisciImporto(5.00);
        Prodotto p = da.getProdotto("001");

        System.out.println("Prodotto fornito: " + p);
        System.out.println("Resto: " + da.getResto());
        System.out.println("Stato finale:\n" + da);
    }
}