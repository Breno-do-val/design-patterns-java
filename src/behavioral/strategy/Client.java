package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        IPaymentStrategy paypalStrategy = new PaypalPaymentStrategy("brenorvale@gmail.com");
        OnlinePurchaseContext onlinePurchaseContextWithPayPal = new OnlinePurchaseContext("Breno", paypalStrategy);

        String paypalStatus = onlinePurchaseContextWithPayPal.executePayment();

        System.out.println("Payment using PayPal");
        System.out.println(paypalStatus);
        System.out.println();

        IPaymentStrategy ccStrategy = new CreditCardPaymentStrategy(13456445L, 12062034, 101);
        OnlinePurchaseContext onlinePurchaseContextWithCC = new OnlinePurchaseContext("Breno", ccStrategy);

        String ccStatus = onlinePurchaseContextWithCC.executePayment();

        System.out.println("Payment using Credit Card");
        System.out.println(ccStatus);
    }
}
