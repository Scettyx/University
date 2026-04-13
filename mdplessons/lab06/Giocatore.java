package lab06;

import java.util.Random;

public class Giocatore {
    private String nome;
    private int posizione;
    private int punti;
    private static Random random = new Random();

    public Giocatore(String nome) {
        this.nome = nome;
        this.posizione = 0;
        this.punti = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public int getPunti() {
        return punti;
    }

    public void modificaPunti(int scarto) {
        this.punti += scarto;
    }

    public int tiraDadi() {
        return random.nextInt(6) + 1;
    }
}