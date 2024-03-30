package design_patterns.vehicle.bridge;

import java.awt.*;

public class Produce extends Workshop
{
    @Override
    public void work()
    {
        System.out.println("Producing...");
    }
}
