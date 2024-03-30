package design_patterns.payment;

import design_patterns.payment.adapter.AdapterPayment;
import design_patterns.payment.adapter.PaymentProcessor;
import design_patterns.payment.singleton.SetupPayment;
import design_patterns.payment.strategy.BirthdayDiscount;
import design_patterns.payment.strategy.ChristmasDiscount;
import design_patterns.payment.strategy.DiscountStrategy;

public class Main
{
    public static void main(String[] args) {
        //Configuring payment
        SetupPayment setupPayment = SetupPayment.getInstance();
        setupPayment.setup("PayPal");

        //Processing the payment
        PaymentProcessor adapter = new AdapterPayment();
        adapter.processPayment(100.0);

        // Applying different discount strategies
        DiscountStrategy strategyChristmas = new ChristmasDiscount();
        double value = strategyChristmas.applyDiscount(100.0);
        System.out.println("Christmas discount price: $" + value);

        DiscountStrategy strategyBrithday = new BirthdayDiscount();
        value = strategyBrithday.applyDiscount(100.0);
        System.out.println("Brithday discount price: $" + value);
    }
}
