package design_patterns.order.observer;

public class Client implements Observer
{
    @Override
    public void update()
    {
        System.out.println("Order delivered! Enjoy your meal");
    }
}
