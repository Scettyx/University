package lab09;

import java.util.Iterator;

public class SuccessioneInfinita implements Iterable<Integer> {

    public Iterator<Integer> iterator() {
        return new IteratoreInfinito();
    }
    
    private class IteratoreInfinito implements Iterator<Integer> {
        private final int[] valori = {4, 8, 15, 16, 23, 42};
        private int indice = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int valoreCorrente = valori[indice];
            indice = (indice + 1) % valori.length;
            return valoreCorrente;
        }
    }
}