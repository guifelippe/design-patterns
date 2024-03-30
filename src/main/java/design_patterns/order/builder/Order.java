package design_patterns.order.builder;

public class Order
{
    private String restaurant;
    private String item;
    private int itemQuantity;

    private Order(Builder builder)
    {
        this.restaurant   = builder.restaurant;
        this.item         = builder.item;
        this.itemQuantity = builder.itemQuantity;
    }

    public String getRestaurant()
    {
        return restaurant;
    }

    public String getItem()
    {
        return item;
    }

    public int getItemQuantity()
    {
        return itemQuantity;
    }

    public static class Builder
    {
        private String restaurant;
        private String item;
        private int itemQuantity;

        public Builder restaurant(String restaurant)
        {
            this.restaurant = restaurant;
            return this;
        }

        public Builder item(String item)
        {
            this.item = item;
            return this;
        }

        public Builder itemQuantity(int itemQuantity)
        {
            this.itemQuantity = itemQuantity;
            return this;
        }

        public Order build()
        {
            return new Order(this);
        }
    }
}
