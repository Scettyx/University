package lab05;

public class Token {
    public static int contaToken(String text, String w) {
        if (text == null || w == null || w.isEmpty()) return 0;

        String[] tokens = text.toLowerCase().split("\\W+");
        String target = w.toLowerCase();
        int occorrenze = 0;

        for (String token : tokens) {
            if (token.equals(target)) {
                occorrenze++;
            }
        }
        return occorrenze;
    }

    public static void main(String[] args) {
        System.out.println(contaToken("Federico ha paura di usare Split.", "Paura"));
    }
}