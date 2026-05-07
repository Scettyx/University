package lab10;

import java.util.Random;

public class Officina {
    private Componente[] magazzino;
    private Componente[] contoFinale;
    private int componentiInConto;
    private int capacitaM;

    public Officina(int m) {
        this.capacitaM = m;
        this.magazzino = new Componente[m];
        this.contoFinale = new Componente[10];
        this.componentiInConto = 0;
    }
    
    public void rifornisci() {
        Random rnd = new Random();
        for (int i = 0; i < capacitaM; i++) {
            int scelta = rnd.nextInt(3);
            if (scelta == 0) magazzino[i] = new Pneumatico();
            else if (scelta == 1) magazzino[i] = new FiltroOlio();
            else magazzino[i] = new PastigliaFreno();
        }
    }

    public Componente applicaComponente(int indice) {
        if (indice < 0 || indice >= capacitaM || magazzino[indice] == null) {
            System.out.println("Componente non valido o già prelevato.");
            return null;
        }

        Componente c = magazzino[indice];
        magazzino[indice] = null;

        if (componentiInConto < contoFinale.length) {
            contoFinale[componentiInConto] = c;
            componentiInConto++;
        }
        return c;
    }

    public double getTotale() {
        double totale = 0;
        for (int i = 0; i < componentiInConto; i++) {
            totale += contoFinale[i].getCostoBase();
        }
        return totale;
    }

    public void emettifattura() {
        for (int i = 0; i < componentiInConto; i++) {
            System.out.println("- " + contoFinale[i].getNome() + ": €" + contoFinale[i].getCostoBase());
        }
        System.out.println("TOTALE: €" + getTotale());

        componentiInConto = 0;
        for (int i = 0; i < contoFinale.length; i++) contoFinale[i] = null;
    }
}