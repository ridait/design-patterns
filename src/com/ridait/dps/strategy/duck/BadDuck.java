package com.ridait.dps.strategy.duck;


public abstract class BadDuck {

    public abstract void display();
    public abstract void fly();

}

//******** Problem of Inheritance *******//
class WildDuck extends BadDuck {

    @Override
    public void display() {

    }

    @Override
    public void fly() {

    }
}

// same for CityDuck
// class CityDuck extends BadDuck { .....

//first problem : (behaviour not existing) for RubberDuck
class RubberDuck extends BadDuck {


    @Override
    public void display() {
        //we can display
    }

    @Override
    public void fly() {
        //can t fly
    }
}
//second problem  : Code duplication - two child classes with same behaviour but diff than parent class

class MountainDuck extends BadDuck {

    @Override
    public void display() {

    }

    @Override
    public void fly() {
     //behaviour same as CloudDuck
    }
}

class CloudDuck extends BadDuck {

    @Override
    public void display() {

    }

    @Override
    public void fly() {
        //behaviour same as MountainDuck
    }
}

//*********************//
