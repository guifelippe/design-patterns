package design_patterns.order.facade;

import design_patterns.order.builder.Order;
import design_patterns.order.observer.SubjectObserved;

public class OrderFacade extends SubjectObserved
{
    private Order order;

    public OrderFacade()
    {
        this.order = new Order.Builder().build();
    }

    public void makeOrder(String restaurant, String item, int itemQuaqntity)
    {
        this.order = new Order.Builder().restaurant(restaurant)
                     .item(item)
                     .itemQuantity(itemQuaqntity)
                     .build();

        System.out.println("Order placed successfully");

        notifyObservers();
    }
}
