package designPatterns.simuduckImplementation;

public class RocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with the power of a rocket");
    }
}
