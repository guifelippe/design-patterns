package design_patterns.payment.singleton;

public class SetupPayment
{
    private static SetupPayment instance = new SetupPayment();

    private SetupPayment() {}

    public static SetupPayment getInstance()
    {
        return instance;
    }

    public void setup(String method)
    {
        System.out.println("Selected payment setup: " + method);
    }
}
