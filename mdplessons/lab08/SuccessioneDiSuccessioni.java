package lab08;

import java.util.Arrays;

public class SuccessioneDiSuccessioni implements Successione {
    private Successione[] successioni;
    private int indice = 0;

    public SuccessioneDiSuccessioni(Successione[] successioni) {
        this.successioni = Arrays.copyOf(successioni, successioni.length);
    }

    @Override
    public int next() {
        int risultato = successioni[indice].next();
        indice = (indice + 1) % successioni.length;
        return risultato;
    }
}