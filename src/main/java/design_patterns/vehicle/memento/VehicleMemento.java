package design_patterns.vehicle.memento;

public class VehicleMemento
{
    private String state;

    public VehicleMemento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}
