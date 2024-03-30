package design_patterns.vehicle.bridge;

public class CarWorkshop extends VehicleWorkshop
{
    public CarWorkshop(Workshop workshop)
    {
        super(workshop);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Car: ");
        workshop.work();
    }
}
