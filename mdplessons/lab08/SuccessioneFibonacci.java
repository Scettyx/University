package lab08;

public class SuccessioneFibonacci implements Successione {
    private int a = 0;
    private int b = 1;

    @Override
    public int next() {
        int prossimo = a + b;
        b = a;
        a = prossimo;
        return prossimo;
    }
}