package lab06;

public class GiocoDellOca {
    private Tabellone tabellone;
    private Giocatore[] giocatori;
    private int dimensione;

    public GiocoDellOca(int n, Giocatore[] giocatori) {
        this.dimensione = n;
        this.giocatori = giocatori;
        this.tabellone = new Tabellone(n, giocatori);
    }
    
    public void giocaUnTurno() {
        for (int i = 0; i < giocatori.length; i++) {
            Giocatore g = giocatori[i];

            int dadi = g.tiraDadi();
            tabellone.spostaGiocatore(g, dadi);

            int pos = g.getPosizione();
            if (pos == dimensione - 1) {
                System.out.println(g.getNome() + " ha vinto la partita.");
                return;
            }

            Casella c = tabellone.getCasella(pos);
            c.applicaEffetto(g, tabellone);
        }
    }

    public static void main(String[] args) {
        Giocatore p1 = new Giocatore("Giocatore 01");
        Giocatore p2 = new Giocatore("Giocatore 02");
        Giocatore[] listaGiocatori = {p1, p2};

        int N = 30;
        GiocoDellOca partita = new GiocoDellOca(N, listaGiocatori);

        boolean inCorso = true;
        while (inCorso) {
            partita.giocaUnTurno();
            for (int i = 0; i < listaGiocatori.length; i++) {
                if (listaGiocatori[i].getPosizione() == N - 1) {
                    inCorso = false;
                    break;
                }
            }
        }
    }
}