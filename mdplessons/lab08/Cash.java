package lab08;

public class Cash implements PaymentMethod {
    private double availableCash;

    public Cash(double availableCash) {
        this.availableCash = availableCash;
    }
    
    @Override
    public boolean pay(double amount) {
        if (availableCash >= amount) {
            availableCash -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Cash";
    }
}