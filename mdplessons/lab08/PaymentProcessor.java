package lab08;

import java.util.List;

public class PaymentProcessor {
    private List<PaymentMethod> methods;

    public PaymentProcessor(List<PaymentMethod> methods) {
        this.methods = methods;
    }

    public void porcessPayments(double amount) {
        for (PaymentMethod m : methods) {
            boolean result = m.pay(amount);
            if (result) {
                System.out.println(m.getName() + ": Successo");
            } else {
                System.out.println(m.getName() + ": Fallimento");
            }
        }
    }
}