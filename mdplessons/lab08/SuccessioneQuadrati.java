package lab08;

public class SuccessioneQuadrati implements Successione {
    private int i = 0;

    @Override
    public int next() {
        int risultato = i * i;
        i++;
        return risultato;
    }
}