package lab08;

public class BankTransfer implements PaymentMethod {
    private int iban;
    private double dailyLimit;

    public BankTransfer(int iban, double dailyLimit) {
        this.iban = iban;
        this.dailyLimit = dailyLimit;
    }
    
    @Override
    public boolean pay(double amount) {
        if (amount <= dailyLimit) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Bank Transfer";
    }
}