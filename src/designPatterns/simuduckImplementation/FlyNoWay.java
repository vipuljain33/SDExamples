package designPatterns.simuduckImplementation;

public class FlyNoWay implements FlyBehavior{


    @Override
    public void fly() {

        System.out.println("I dont have wings, so I cant fly");

    }
}
