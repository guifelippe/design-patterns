package design_patterns.car.prototype;

public class ConcreteCar extends Car
{
    public ConcreteCar(String model)
    {
        this.model = model;
    }

    public void displayInfo()
    {
        System.out.println("Model: " + model + ", Color: " + color + ", Engine size: " + engineSize);
    }
}
