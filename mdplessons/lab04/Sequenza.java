package lab04;

import java.util.Arrays;

public class Sequenza {
    int[] seq, copia;

    public Sequenza(int[] seq) {
        this.seq = seq;
        copia = Arrays.copyOf(seq, seq.length);
        Arrays.sort(copia);
    }
    
    public int getMediana() {
        return copia[copia.length / 2];
    }

    public double getMedia() {
        double media = 0;
        for (int num : copia) {
            media += num;
        }
        return media / copia.length;
    }

    public int getModa() {
        int[] mode = new int[copia[copia.length - 1] + 1];
        int moda = 0, maxFreq = 0;

        for (int i = 0; i < copia.length; i++) {
            int num = copia[i];
            mode[num]++;
        }

        for (int i = 0; i < mode.length; i++) {
            if (mode[i] > maxFreq) {
                maxFreq = mode[i];
                moda = i;
            }
        }
        return moda;
    }
    
    public static void main(String[] args) {
        int[] dati = {30, 23, 30, 24, 18};
        Sequenza s = new Sequenza(dati);

        System.out.println(String.format("Mediana: \t%d", s.getMediana()));
        System.out.println(String.format("Media: \t\t%.2f", s.getMedia()));
        System.out.println(String.format("Moda: \t\t%d", s.getModa()));
    }
}