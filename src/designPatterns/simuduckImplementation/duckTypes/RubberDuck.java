package designPatterns.simuduckImplementation.duckTypes;

import designPatterns.simuduckImplementation.Duck;
import designPatterns.simuduckImplementation.FlyNoWay;
import designPatterns.simuduckImplementation.Squeak;

public class RubberDuck extends Duck {



    @Override
    public void display() {
        System.out.println("I look like a rubber duck");
    }
}
