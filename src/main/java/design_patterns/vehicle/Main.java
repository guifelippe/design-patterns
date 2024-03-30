package design_patterns.vehicle;

import design_patterns.vehicle.abstractfactory.BikeFactory;
import design_patterns.vehicle.abstractfactory.CarFactory;
import design_patterns.vehicle.abstractfactory.Vehicle;
import design_patterns.vehicle.abstractfactory.VehicleFactory;
import design_patterns.vehicle.bridge.*;
import design_patterns.vehicle.memento.VehicleMemento;
import design_patterns.vehicle.memento.VehicleOriginator;

public class Main {
    public static void main(String[] args) {
        // Using Abstract Factory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.assemble();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.assemble();

        // Using Bridge
        Workshop produce = new Produce();
        Workshop assemble = new Assemble();

        VehicleWorkshop carProduce = new CarWorkshop(produce);
        carProduce.manufacture();

        VehicleWorkshop carAssemble = new CarWorkshop(assemble);
        carAssemble.manufacture();

        VehicleWorkshop bikeProduce = new BikeWorkshop(produce);
        bikeProduce.manufacture();

        VehicleWorkshop bikeAssemble = new BikeWorkshop(assemble);
        bikeAssemble.manufacture();

        // Using Memento
        VehicleOriginator originator = new VehicleOriginator();
        originator.setState("Initial state");

        VehicleMemento memento = originator.saveStateToMemento();
        originator.setState("New state");

        originator.getStateFromMemento(memento);
    }
}
