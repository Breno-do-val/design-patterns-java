package behavioral.strategy;

public class CreditCardPaymentStrategy implements IPaymentStrategy {
    private Long ccNumber;
    private Integer expirationTime;
    private Integer code;

    public CreditCardPaymentStrategy(Long ccNumber, Integer expirationTime, Integer code) {
        this.ccNumber = ccNumber;
        this.expirationTime = expirationTime;
        this.code = code;
    }

    @Override
    public Boolean executePayment() {
        if (this.ccNumber.toString().startsWith("123") && this.code > 100) {
            return true;
        }
        return false;
    }
}
