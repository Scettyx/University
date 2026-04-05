package lab05;

public class Triangolo extends Figura {
    private int base, altezza;

    public Triangolo(String nome, int base, int altezza) {
        super(nome);
        this.base = base;
        this.altezza = altezza;
    }

    public int area() {
        return(this.base * this.altezza) / 2;
    }
}