public class SistemaPagamenti {
    private MetodoPagamento[] metodi;
    private int conteggio;

    public SistemaPagamenti(int capacità) {
        this.metodi = new MetodoPagamento[capacità];
        this.conteggio = 0;
    }
    
    public void aggiungiMetodo(MetodoPagamento m) {
        if (this.conteggio < this.metodi.length) {
            this.metodi[this.conteggio] = m;
            this.conteggio++;
        }
    }

    public void eseguiPagamenti(double importo) {
        for (int i = 0; i < this.metodi.length; i++) {
            this.metodi[i].paga(importo);
        }
    }
}
