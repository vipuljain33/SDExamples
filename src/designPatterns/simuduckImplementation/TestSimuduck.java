package designPatterns.simuduckImplementation;

import designPatterns.simuduckImplementation.duckTypes.MallardDuck;
import designPatterns.simuduckImplementation.duckTypes.RedHeadDuck;
import designPatterns.simuduckImplementation.duckTypes.RubberDuck;

public class TestSimuduck {

    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();

        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());

        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        System.out.println();


        Duck rubber = new RubberDuck();

        rubber.setQuackBehavior(new Squeak());
        rubber.setFlyBehavior(new FlyNoWay());

        rubber.performFly();
        rubber.performQuack();
        rubber.display();
        rubber.swim();

        System.out.println();

        Duck redHead = new RedHeadDuck();

        redHead.setFlyBehavior(new RocketPowered());
        redHead.setQuackBehavior(new Quack());

        redHead.performFly();
        redHead.performQuack();
        redHead.display();
        redHead.swim();
    }
}
