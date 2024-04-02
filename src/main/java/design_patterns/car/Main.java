package design_patterns.car;

import design_patterns.car.flyweight.CarFlyweightFactory;
import design_patterns.car.iterator.Iterator;
import design_patterns.car.prototype.Car;

public class Main {
    public static void main(String[] args) {
        CarFlyweightFactory factory = new CarFlyweightFactory();

        Car car1 = factory.getCar("Model A");
        car1.setColor("Red");
        car1.setEngineSize("2.0L");

        Car car2 = factory.getCar("Model B");
        car2.setColor("Blue");
        car2.setEngineSize("2.5L");

        Car car3 = factory.getCar("Model C");
        car3.setColor("Black");
        car3.setEngineSize("3.0L");

        Iterator iterator = factory.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            car.displayInfo();
        }

        try {
            Car clonedCar = car1.clone();
            clonedCar.displayInfo();
        } catch (Exception err) {
        }
    }
}