package design_patterns.vehicle.bridge;

public class CarWorkshop extends VehicleWorkshop
{
    public CarWorkshop(Workshop workshop)
    {
        super(workshop);
    }

    @Override
    void manufacture()
    {
        System.out.print("Car: ");
        workshop.work();
    }
}
