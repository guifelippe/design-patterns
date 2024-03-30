package design_patterns.vehicle.abstractfactory;

public class Car implements Vehicle
{
    @Override
    public void assemble()
    {
        System.out.println("Assembling the car...");
    }
}
