package lab09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudente {
    public static void main(String[] args) {
        List<Studente> studenti = new ArrayList<>();

        studenti.add(new Studente("Cosmin", "Florea", 27.3));
        studenti.add(new Studente("Andry", "Ukraynsky", 26.5));
        studenti.add(new Studente("Lucy", "Illa", 21.0));
        studenti.add(new Studente("Federico", "Rimini", 29.5));
        studenti.add(new Studente("Massimo", "Bossetti", 29.9));

        System.out.println("Prima dell'ordinamento: ");
        for (Studente s : studenti) {
            System.out.println(s);
        }

        Collections.sort(studenti);

        System.out.println("\nDopo l'ordinamento: ");
        for (Studente s : studenti) {
            System.out.println(s);
        }
    }
}