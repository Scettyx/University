public class Quadrato extends Figura {
    private int lato;

    public Quadrato(String nome, int lato) {
        super(nome);
        this.lato = lato;
    }

    public String toString() {
        return super.toString() + lato;
    }

    public int area() {
        return this.lato * this.lato;
    }
}