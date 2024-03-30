package design_patterns.order;

import design_patterns.order.facade.OrderFacade;
import design_patterns.order.observer.Client;

public class Main
{
    public static void main(String[] args) {
        // Creating the order facade
        OrderFacade orderFacade = new OrderFacade();

        // Creating a client
        Client client = new Client();

        // Adding the client as an observer
        orderFacade.addObserver(client);

        // Placing an order
        orderFacade.makeOrder("Restaurant X", "Pizza", 1);
    }
}
