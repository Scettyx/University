public class PortafoglioDigitale extends MetodoPagamento {
    private double percentualeCashback;

    public PortafoglioDigitale(String intestatario, double saldo, double percentualeCashback) {
        super(intestatario, saldo);
        this.percentualeCashback = percentualeCashback;
    }

    public boolean paga(double importo) {
        if (this.saldo >= importo) {
            this.saldo -= importo;
            double cashback = importo * this.percentualeCashback / 100.0;
            this.accredita(cashback);
            return true;
        } return false;
    }
}