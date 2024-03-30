package design_patterns.payment.strategy;

public class BirthdayDiscount implements DiscountStrategy
{
    @Override
    public double applyDiscount(double value)
    {
        System.out.println("Applying birthday discount...");
        return value * 0.8;
    }
}
