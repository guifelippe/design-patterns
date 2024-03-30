package design_patterns.vehicle.bridge;

public class BikeWorkshop extends VehicleWorkshop
{
    public BikeWorkshop(Workshop workshop)
    {
        super(workshop);
    }

    @Override
    void manufacture()
    {
        System.out.print("Bike: ");
        workshop.work();
    }
}
