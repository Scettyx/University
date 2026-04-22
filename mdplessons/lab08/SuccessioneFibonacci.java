package lab08;

public class SuccessioneFibonacci implements Successione {
    private int a = 1;
    private int b = 0;

    @Override
    public int next() {
        int prossimo = a + b;
        b = a;
        a = prossimo;
        return prossimo;
    }
}