package lab06;

public class CasellaPunti extends Casella {
    private int variazionePunti;

    public CasellaPunti(int variazionePunti) {
        this.variazionePunti = variazionePunti;
    }

    public void applicaEffetto(Giocatore g, Tabellone t) {
        g.modificaPunti(variazionePunti);
    }
}