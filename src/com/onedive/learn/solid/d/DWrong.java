package com.onedive.learn.solid.d;

/*
Class ini menyalahi prinsip DIP dikarnakan kelas car sangat depen / ketergantungan dengan class Engine
yang mana class car seharusnya bergantung kepada abstaction bukan pada suatu class low level
 */
class Car {
    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    Engine startEngine(){
        return engine.start();
    }
}

class Engine{
    Engine start(){
        System.out.println("Engine is started");
        return this;
    }
}

class Diesel {

    Diesel start(){
        System.out.println("DIesel engine is started");
        return this;
    }

}


public class DWrong {

    public static void main(String[] args) {
        Car car = new Car(new Engine());
        car.startEngine();
        // err Car car1 = new Car(new Diesel());
    }
}
