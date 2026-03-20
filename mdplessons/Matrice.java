import java.util.Random;

public class Matrice {
    private int[][] matrice;

    public Matrice(int n) {
        matrice = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(10);
            }
        }
    }
    
    public static void main(String[] args) {
        Matrice mat = new Matrice(4);

        for (int[] riga : mat.matrice) {
            for (int valore : riga) {
                System.out.print(String.format("%d\t", valore));
            }
            System.out.println();
        }
    }
}