package design_patterns.vehicle.abstractfactory;

public class CarFactory  implements VehicleFactory
{
     @Override
    public Vehicle createVehicle()
     {
         return new Car();
     }
}
