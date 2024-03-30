package design_patterns.vehicle.memento;

public class VehicleOriginator
{
    private String state;

    public void setState(String state)
    {
        System.out.println("Status updated to: " + state);
        this.state = state;
    }

    public VehicleMemento saveStateToMemento()
    {
        return new VehicleMemento(state);
    }

    public void getStateFromMemento(VehicleMemento memento)
    {
        state = memento.getState();
        System.out.println("State restored to: " + state);
    }
}
