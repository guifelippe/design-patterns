package design_patterns.payment.adapter;

public class AdapterPayment implements PaymentProcessor
{
    private PaymentProcessorPayPal paymentProcessorPayPal;

    public AdapterPayment()
    {
        this.paymentProcessorPayPal = new PaymentProcessorPayPal();
    }

    @Override
    public void processPayment(double value)
    {
        paymentProcessorPayPal.processPayment(value);
    }
}
