package design_patterns.payment.adapter;

public class PaymentProcessorPayPal implements PaymentProcessor
{
    @Override
    public void processPayment(double value)
    {
        System.out.println("Payment processed by PayPal: $" + value);
    }
}
