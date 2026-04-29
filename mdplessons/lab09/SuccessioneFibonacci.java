package lab09;

import java.util.Iterator;

public class SuccessioneFibonacci implements Iterable<Integer> {

    public Iterator<Integer> iterator() {
        return new IteratoreFibonacci();
    }

    private class IteratoreFibonacci implements Iterator<Integer> {
        private int a = 0;
        private int b = 1;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int prossimo = a + b;
            b = a;
            a = prossimo;
            return prossimo;
        }
    }
}