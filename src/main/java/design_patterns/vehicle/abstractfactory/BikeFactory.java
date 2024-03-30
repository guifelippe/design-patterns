package design_patterns.vehicle.abstractfactory;

public class BikeFactory implements VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new Bike();
    }
}
