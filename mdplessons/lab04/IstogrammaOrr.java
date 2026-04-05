package lab04;

public class IstogrammaOrr {
    private int min, max;
    private int[] values;

    public IstogrammaOrr(int min, int max) {
        this.min = min;
        this.max = max;
        this.values = new int[max - min + 1];
    }

    public void aggiungi(int voto) {
        if (min <= voto && voto <= max) {
            values[voto - min]++;
        } else {
            System.out.println("Voto NON valido.");
        }
    }

    public void stampa() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                System.out.print(String.format("%d:\t", (min + i)));
                for (int k = 0; k < values[i]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        IstogrammaOrr ist = new IstogrammaOrr(0, 31);
        ist.aggiungi(30);
        ist.aggiungi(24);
        ist.aggiungi(24);
        ist.stampa();
    }
}