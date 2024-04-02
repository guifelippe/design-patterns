package design_patterns.car.prototype;

public abstract class Car implements Cloneable
{
    protected String model;
    protected String color;
    protected String engineSize;

    public abstract void displayInfo();

    @Override
    public Car clone() throws CloneNotSupportedException
    {
        return (Car) super.clone();
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setEngineSize(String engineSize)
    {
        this.engineSize = engineSize;
    }
}
