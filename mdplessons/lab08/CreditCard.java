package lab08;

public class CreditCard implements PaymentMethod, Refundable {
    @SuppressWarnings("unused")
    private String cardNumber;
    private double balance;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Credit Card";
    }

    @Override
    public void refund(double amount) {
        balance += amount;
    }
}