import java.util.Random;

public class EstrazioneDelLotto {
    private int[] ultimiEstratti = new int[5];
    private int totaleStorico = 0;
    private Random rand = new Random();

    public void estrai() {
        for (int i = 0; i < ultimiEstratti.length; i++) {
            int num = rand.nextInt(90) + 1;
            ultimiEstratti[i] = num;
            totaleStorico += num;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < ultimiEstratti.length; i++) {
            s += ultimiEstratti[i];
            if (i < ultimiEstratti.length - 1) {
                s += ", ";
            }
        }
        return s;
    }

    public int numeriContenuti(int[] giocata) {
        if (giocata == null || giocata.length > 10) return 0;

        int count = 0;
        for (int i = 0; i < giocata.length; i++) {
            for (int j = 0; j < ultimiEstratti.length; j++) {
                if (giocata[i] == ultimiEstratti[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public boolean vincita(int[] giocata) {
        return numeriContenuti(giocata) >= 2;
    }

    public int getTotaleNumeriEstratti() {
        return totaleStorico;
    }

    public static void main(String[] args) {
        EstrazioneDelLotto lotto = new EstrazioneDelLotto();

        lotto.estrai();
        System.out.println("Estrazione: " + lotto.toString());

        int[] giocata = {10, 20, 30, 40, 50, 60};
        System.out.println("Match: " + lotto.numeriContenuti(giocata));
        System.out.println("Vincita: " + lotto.vincita(giocata));

        lotto.estrai();
        System.out.println("Estrazione 2: " + lotto.toString());
        System.out.println("Totale estratti: " + lotto.getTotaleNumeriEstratti());
    }
}