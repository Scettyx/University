package lab09;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class SuccessioneDiSuccessioni implements Iterable<Integer> {

    private Iterable<Integer>[] successioni;

    @SafeVarargs
    public SuccessioneDiSuccessioni(Iterable<Integer>... successioni) {
        this.successioni = successioni;
    }

    public Iterator<Integer> iterator() {
        return new IteratoreDiSuccessioni();
    }

    private class IteratoreDiSuccessioni implements Iterator<Integer> {
        private List<Iterator<Integer>> iteratori;
        private int indiceCorrente = 0;

        public IteratoreDiSuccessioni() {
            iteratori = new ArrayList<>();
            for (Iterable<Integer> s : successioni) {
                iteratori.add(s.iterator());
            }
        }

        @Override
        public boolean hasNext() {
            return !iteratori.isEmpty();
        }

        @Override
        public Integer next() {
            Iterator<Integer> iteratoreAttuale = iteratori.get(indiceCorrente);
            int valore = iteratoreAttuale.next();
            indiceCorrente = (indiceCorrente + 1) % iteratori.size();
            return valore;
        }
    }
}