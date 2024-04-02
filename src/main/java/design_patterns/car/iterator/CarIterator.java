package design_patterns.car.iterator;

import design_patterns.car.prototype.Car;

public class CarIterator implements Iterator
{
    private java.util.Iterator<Car> carsIterator;

    public CarIterator(java.util.Iterator<Car> carsIterator)
    {
        this.carsIterator = carsIterator;
    }

    @Override
    public boolean hasNext()
    {
        return carsIterator.hasNext();
    }

    @Override
    public Car next()
    {
        return carsIterator.next();
    }
}
