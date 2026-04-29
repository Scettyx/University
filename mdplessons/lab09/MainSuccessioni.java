package lab09;

import java.util.Iterator;

public class MainSuccessioni {
    public static void main(String[] args) {
        SuccessioneQuadrati quadrati = new SuccessioneQuadrati();
        SuccessioneFibonacci fibonacci = new SuccessioneFibonacci();
        SuccessioneInfinita infinita = new SuccessioneInfinita();

        SuccessioneDiSuccessioni successioneMista = new SuccessioneDiSuccessioni(quadrati, fibonacci, infinita);

        Iterator<Integer> it = successioneMista.iterator();

        for(int i = 0; i < 10; i++) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}