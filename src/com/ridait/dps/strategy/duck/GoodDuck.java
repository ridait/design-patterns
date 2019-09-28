package com.ridait.dps.strategy.duck;

//Strategy Implementation

public class GoodDuck{

    public static void main(String...args){
        Duck defaultDuck = new Duck(new DefaultDisplayStrategy(),new DefaultFlyingStrategy());
        defaultDuck.display();
        defaultDuck.fly();

        Duck anotherDuck = new Duck(new AnotherDisplayStrategy(),new AnotherFlyingStrategy());
        anotherDuck.display();
        anotherDuck.fly();

        Duck hybridDuck = new Duck(new DefaultDisplayStrategy(),new AnotherFlyingStrategy());
        hybridDuck.display();
        hybridDuck.fly();

    }

}

class Duck {
    DisplayingStrategy displayMethod;
    FlyingStrategy flyMethod;

    public Duck(DisplayingStrategy displayMethod, FlyingStrategy flyMethod){
        this.displayMethod = displayMethod;
        this.flyMethod = flyMethod;
    }

    public void display(){
        this.displayMethod.display();
    }

    public  void fly(){
        this.flyMethod.fly();
    }
}


interface DisplayingStrategy{
    void display();
}

class DefaultDisplayStrategy implements DisplayingStrategy{
    @Override
    public void display() {
        System.out.println("I am a [default] displayed duck");
    }
}

class AnotherDisplayStrategy implements DisplayingStrategy{
    @Override
    public void display() {
        System.out.println("I am [another] displayed duck");
    }
}

interface FlyingStrategy{
    void fly();
}

class DefaultFlyingStrategy implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("I am a [default] flying duck");
    }
}

class AnotherFlyingStrategy implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("I am [another] flying duck");
    }
}