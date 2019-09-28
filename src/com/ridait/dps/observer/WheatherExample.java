package com.ridait.dps.observer;


import java.util.ArrayList;
import java.util.List;

public class WheatherExample {

    public static void main(String... args){
        WheatherStation station = new WheatherStation();
        PhoneDisplay phone = new PhoneDisplay(station);
        AnotherDisplay another = new AnotherDisplay(station);
        station.addObserver(phone);
        station.addObserver(another);

        station.changeTemp(10);
        station.changeTemp(13);
        station.changeTemp(25);
    }

}


interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}

interface IObserver{
    void update();
}

class WheatherStation implements IObservable{

    private List<IObserver> observers = new ArrayList<>();
    private int temp;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer->observer.update());
    }

    public int getTemp(){
        return temp;
    }

    public void changeTemp(int temp){
        this.temp = temp;
        notifyObservers();
    }
}

class PhoneDisplay implements IObserver{

    private WheatherStation wheatherStation;
    private int temp;

    public PhoneDisplay(WheatherStation wheatherStation){
        this.wheatherStation = wheatherStation;
    }

    @Override
    public void update() {
        temp = wheatherStation.getTemp();
        displayTemp();
    }

    public void displayTemp(){
        System.out.println("actual temp from phone display is :"+ temp);
    }
}

class AnotherDisplay implements IObserver{

    private WheatherStation wheatherStation;
    private int temp;

    public AnotherDisplay(WheatherStation wheatherStation){
        this.wheatherStation = wheatherStation;
    }

    @Override
    public void update() {
        temp = wheatherStation.getTemp();
        displayTemp();
    }

    public void displayTemp(){
        System.out.println("actual temp from Another display  is :"+ temp);
    }
}

