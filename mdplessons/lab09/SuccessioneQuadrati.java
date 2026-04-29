package lab09;

import java.util.Iterator;

public class SuccessioneQuadrati implements Iterable<Integer> {
    
    public Iterator<Integer> iterator() {
        return new IteratoreQuadrati();
    }

    private class IteratoreQuadrati implements Iterator<Integer> {
        private int cursore = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int quadrato = cursore + cursore;
            cursore++;
            return quadrato;
        }
    }
}