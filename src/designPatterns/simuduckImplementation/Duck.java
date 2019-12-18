package designPatterns.simuduckImplementation;

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void swim()
    {
        System.out.println("All ducks swim, even the decoys");
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void performFly()
    {
        flyBehavior.fly();
    }
}
