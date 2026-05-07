package lab10;

import java.util.function.Predicate;

public class EditorDiTesto {
    public static String elabora(String s, Trasformatore t) {
        return t.trasforma(s);
    }

    public static String elaboraSeValido(String s, Trasformatore t, Predicate<String> p) {
        if (p.test(s)) {
            return t.trasforma(s);
        }
        return s;
    }

    public static void main(String[] args) {
        String testoOriginale = "ciao mondo";

        String inMaiuscolo = elabora(testoOriginale, s -> s.toUpperCase());
        System.out.println("Maiuscolo: " + inMaiuscolo);

        String conPrefisso = elabora(testoOriginale, s -> "LOG: " + s);
        System.out.println("Prefisso: " + conPrefisso);

        String invertita = elabora(testoOriginale, s -> new StringBuilder(s).reverse().toString());
        System.out.println("Invertita: " + invertita);

        String elaboraCondizionale = elaboraSeValido(
            testoOriginale,
            s -> s.toUpperCase(),
            s -> s.length() > 5
        );
        System.out.println("Condizionale (length > 5): " + elaboraCondizionale);
    }
}