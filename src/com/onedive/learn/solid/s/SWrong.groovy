package com.onedive.learn.solid.s

/*
Ini merupakah class yg menyalahi aturan dari single responsibility principle karna
pada class ini terlalu banyak menangani fitur fitur / terlalu banyak tanggung jawabnya,
sehingga kita harus memisahkannya menjadi 3 class
agar lebih mudah kedepannya untuk melakukan update / perbaikan.
 */

class Car {

    void turnOnEngine(){
        // implementation code
    }

    void turnOffEngine(){
        // implementation code
    }

    void turnOnAc(){
        // implementation code
    }

    void turnOffAc(){
        // implementation code
    }

    void turnOnRadio(){
        // implementation code
    }

    void turnOffRadio(){
        // implementation code
    }

    void changeRadioChannel(){
        // implementation code
    }

}

class SWrong{

    static void main(String[] args) {
        Car car = new Car()
        car.turnOnAc()
    }

}
