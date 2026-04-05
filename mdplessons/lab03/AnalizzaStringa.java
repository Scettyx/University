package lab03;

public class AnalizzaStringa {
    private String testo;

    public AnalizzaStringa(String testo) {
        this.testo = testo;
    }

    public int lunghezza() {
        return testo.length();
    }

    public char iesimoCarattere(int i) {
        return testo.charAt(i);
    }

    public char primoCarattere() {
        return iesimoCarattere(0);
    }

    public char ultimoCarattere() {
        return iesimoCarattere(lunghezza() - 1);
    }

    public String maiuscolo() {
        return testo.toUpperCase();
    }

    public String minuscolo() {
        return testo.toLowerCase();
    }

    public static void main(String[] args) {
        AnalizzaStringa as = new AnalizzaStringa("Programmazione");

        System.out.println(as.lunghezza());
        System.out.println(as.primoCarattere());
        System.out.println(as.ultimoCarattere());
        System.out.println(as.maiuscolo());
        System.out.println(as.minuscolo());
    }
}
