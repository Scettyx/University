package lab04;

public class IstogrammaVer {
    private int min, max;
    private int[] values;

    public IstogrammaVer(int min, int max) {
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
        int maxCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxCount) {
                maxCount = i;
            }
        }

        for (int r = maxCount; r > 0; r--) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] > 0) {
                    if (values[i] >= r) {
                        System.out.print("*\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                System.out.print((min + i) + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IstogrammaVer ist = new IstogrammaVer(0, 31);
        ist.aggiungi(30);
        ist.aggiungi(24);
        ist.aggiungi(24);
        ist.stampa();
    }
}