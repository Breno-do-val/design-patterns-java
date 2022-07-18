package behavioral.strategy;

public class OnlinePurchaseContext {
    private String name;
    private IPaymentStrategy strategy;

    public OnlinePurchaseContext(String name, IPaymentStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String executePayment() {
        if (this.strategy.executePayment()) {
            return String.format("Thanks %s for your payment", this.name);
        } else {
            return "Something went wrong!!!";
        }
    }
}
