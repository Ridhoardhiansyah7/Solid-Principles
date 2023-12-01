package com.onedive.learn.solid.i

/*
Class ini sudah menerapkah prinsip interface segregation karna pada setiap class yg mengimplementasikan
Vehicle menggunakan semua fungsi yg ada pada interface tsb
 */
interface Vehicle {
    void turnOnEngine()
    void turnOffEngine()
}

class Car implements Vehicle {

    @Override
    void turnOnEngine() {
        println("Mobil telah menyala ")
    }

    @Override
    void turnOffEngine() {
        println("MObil telah mati")
    }

}

class MotorCycle implements Vehicle {

    @Override
    void turnOnEngine() {
        println("Motor telah menyala")
    }

    @Override
    void turnOffEngine() {
        println("MOtor telah mati")
    }
}

class IRight {

    static void main(String[] args) {

        Vehicle vehicle = new Car()
        vehicle.turnOnEngine()
        vehicle.turnOffEngine()

        println("==============")
        vehicle = new MotorCycle()
        vehicle.turnOnEngine()
        vehicle.turnOffEngine()

    }
}
