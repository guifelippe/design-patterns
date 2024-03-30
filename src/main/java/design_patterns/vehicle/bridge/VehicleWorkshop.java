package design_patterns.vehicle.bridge;

public abstract class VehicleWorkshop
{
    protected Workshop workshop;

    protected VehicleWorkshop(Workshop workshop)
    {
        this.workshop = workshop;
    }

    public abstract void manufacture();
}
