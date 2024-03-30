package design_patterns.vehicle.bridge;

abstract class VehicleWorkshop
{
    protected Workshop workshop;

    protected VehicleWorkshop(Workshop workshop)
    {
        this.workshop = workshop;
    }

    abstract void manufacture();
}
