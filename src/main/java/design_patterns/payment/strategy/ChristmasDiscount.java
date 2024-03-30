package design_patterns.payment.strategy;

public class ChristmasDiscount implements DiscountStrategy
{
    @Override
    public double applyDiscount(double value)
    {
        System.out.println("Applying Christmas discount...");
        return value * 0.9;
    }
}
