package lab05;

public abstract class Figura {
    private String nome;

    public Figura(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }

    abstract public int area();
}