public abstract class Prodotto {
    private double prezzo;
    private String id;

    public Prodotto(double prezzo, String id) {
        this.prezzo = prezzo;
        this.id = id;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Prodotto: " + this.getClass().getSimpleName() + "\tPrezzo: " + prezzo + "\tID: " + id;
    }
}