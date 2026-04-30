package lab09;

public class Carta {

    private final Seme seme;
    private final Valore valore;
    public Carta(Seme seme, Valore valore) {
        this.seme = seme;
        this.valore = valore;
    }
    
    @Override
    public String toString() {
        return valore.nome + " di " + seme.nome;
    }
}