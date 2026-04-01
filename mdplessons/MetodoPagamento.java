public abstract class MetodoPagamento {
    protected String intestatario;
    protected double saldo;
    
    public MetodoPagamento(String intestatario, double saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public abstract boolean paga(double importo);

    public void accredita(double importo) {
        this.saldo += importo;
    }
}