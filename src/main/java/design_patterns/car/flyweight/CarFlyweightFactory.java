package design_patterns.car.flyweight;

import design_patterns.car.iterator.CarIterator;
import design_patterns.car.iterator.Iterable;
import design_patterns.car.iterator.Iterator;
import design_patterns.car.prototype.Car;
import design_patterns.car.prototype.ConcreteCar;

import java.util.HashMap;
import java.util.Map;

public class CarFlyweightFactory implements Iterable
{
    private Map<String, Car> cars = new HashMap<>();

    public Car getCar(String model)
    {
        Car car = cars.get(model);

        if(car == null)
        {
            car = new ConcreteCar(model);
            cars.put(model, car);
        }

        return car;
    }

    @Override
    public Iterator iterator()
    {
        return new CarIterator(cars.values().iterator());
    }
}
