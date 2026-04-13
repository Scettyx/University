package lab06;

public class CasellaSpostaGiocatore extends Casella {
    private int spostamento;

    public CasellaSpostaGiocatore(int spostamento) {
        this.spostamento = spostamento;
    }

    public void applicaEffetto(Giocatore g, Tabellone t) {
        t.spostaGiocatore(g, spostamento);
    }
}
