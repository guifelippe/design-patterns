package design_patterns.car.iterator;

import design_patterns.car.prototype.Car;

public interface Iterator
{
    boolean hasNext();
    Car next();
}
