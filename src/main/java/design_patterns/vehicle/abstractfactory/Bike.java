package design_patterns.vehicle.abstractfactory;

public class Bike implements Vehicle
{
    @Override
    public void assemble()
    {
        System.out.println("Assembling the bike...");
    }
}
