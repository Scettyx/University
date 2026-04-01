public class CartaDiCredito extends MetodoPagamento {
    private double limite;

    public CartaDiCredito(String intestatario, double saldo, double limite) {
        super(intestatario, saldo);
        this.limite = limite;
    }

    public boolean paga(double importo) {
        if (this.saldo - importo >= -this.limite) {
            this.saldo -= importo;
            return true;
        } return false;
    }
}