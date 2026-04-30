package lab08; 

import java.util.List;
import java.util.ArrayList;

public class MainPayments {
    public static void main(String[] args) {
        PaymentMethod[] metodi = new PaymentMethod[] {
            new CreditCard("1234-5678-9012-3456", 100.0),
            new BankTransfer("IT12345678901234", 500.0),
            new Cash(50.0)
        };

        List<PaymentMethod> listaMetodi = new ArrayList<>();
        for (PaymentMethod m : metodi) {
            listaMetodi.add(m);
        }

        PaymentProcessor processore = new PaymentProcessor(listaMetodi);
        processore.porcessPayments(60.0);
        processore.porcessPayments(30.0);

        for (PaymentMethod m : metodi) {
            if (m instanceof Refundable) {
                ((Refundable) m).refund(10.0);
            }
        }
    }
}