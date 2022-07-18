package behavioral.strategy;

public class PaypalPaymentStrategy implements IPaymentStrategy {
    private String email;

    public PaypalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public Boolean executePayment() {
        if (this.email.contains("@")) {
            return true;
        }
        return false;
    }
}
