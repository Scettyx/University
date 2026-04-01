public class ContoBancario extends MetodoPagamento {
    public ContoBancario(String intestatario, double saldo) {
        super(intestatario, saldo);
    }
    
    public boolean paga(double importo) {
        if (this.saldo >= importo) {
            this.saldo -= importo;
            return true;
        } return false;
    }
}