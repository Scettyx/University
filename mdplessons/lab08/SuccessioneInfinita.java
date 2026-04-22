package lab08;

public class SuccessioneInfinita implements Successione {
    private int[] valori = {4, 8, 15, 16, 23, 42};
    private int indice = 0;
        
    public int next() {
        int risultato = valori[indice];
        indice = (indice + 1) % valori.length;
        return risultato;
    }
}