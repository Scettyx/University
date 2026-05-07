package lab10;

public abstract class Componente {
    private String nome;
    private double costoBase;

    public Componente(String nome, double costoBase) {
        this.nome = nome;
        this.costoBase = costoBase;
    }

    public String getNome() { return nome; }
    public double getCostoBase() {return costoBase; }
}