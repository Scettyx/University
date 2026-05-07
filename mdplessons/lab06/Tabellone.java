package lab06;

import java.util.Random;

public class Tabellone {
    private Casella[] caselle;
    @SuppressWarnings("unused")
    private Giocatore[] giocatori;
    private int dimensione;

    public Tabellone(int n, Giocatore[] giocatori) {
        this.dimensione = n;
        this.giocatori = giocatori;
        this.caselle = new Casella[n];
        inizializzaTabellone();
    }

    private void inizializzaTabellone() {
        Random r = new Random();
        for (int i = 0; i < dimensione; i++) {
            int tipo = r.nextInt(3);
            if (tipo == 0) {
                caselle[i] = new CasellaVuota();
            } else if (tipo == 1) {
                caselle[i] = new CasellaPunti(r.nextInt(10) - 5);
            } else {
                caselle[i] = new CasellaSpostaGiocatore(r.nextInt(5) - 2);
            }
        }
        caselle[dimensione - 1] = new CasellaVuota();
    }
    
    public void spostaGiocatore(Giocatore g, int passi) {
        int target = g.getPosizione() + passi;
        int traguardo = dimensione - 1;

        if (target > traguardo) {
            int scarto = target - traguardo;
            target = traguardo - scarto;
        } else if (target < 0) {
            target = 0;
        }

        g.setPosizione(target);
    }

    public Casella getCasella(int indice) {
        return caselle[indice];
    }
}