package lab09;

import java.util.Iterator;
import java.util.Random;

public class MazzoDiCarte implements Iterable<Carta> {
    private final Carta[] carte;
    private int carteDistribuite;

    public MazzoDiCarte() {
        carte = new Carta[52];
        int i = 0;
        for (Seme s : Seme.values()) {
            for (Valore v : Valore.values()) {
                carte[i++] = new Carta(s, v);
            }
        }
        carteDistribuite = 0;
    }

    public void mescola() {
        Random random = new Random();
        for (int i = carte.length; i > 0; i--) {
            int index = random.nextInt(i+1);
            Carta temp = carte[index];
            carte[index] = carte[i];
            carte[i]= temp;
        }
        carteDistribuite = 0;
    }

    @Override
    public Iterator<Carta> iterator() {
        return new Iterator<Carta>() {

            @Override
            public boolean hasNext() {
                return carteDistribuite < carte.length;
            }

            @Override
            public Carta next() {
                return carte[carteDistribuite++];
            }
        };
    }
}