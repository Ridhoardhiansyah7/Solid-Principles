package com.onedive.learn.solid.s

/*
Ini adalah contoh class yg menerapkan prinsip single responsibility karna untuk setiap fungsi yg tidak memiliki
keterkaitan dipisahkan pada class yg berbeda
 */
class Car2 {

    private AirConditioner airConditioner;
    private Radio radio;

    void turnOnEngine(){
        println("Mesin telah menyala")
    }

    void turnOffEngine(){
        Thread.sleep(3000L)

        println("Memastikan radio dan ac juga mati jika belum!")
        getAirConditioner().turnOffAc()
        getRadio().turnOffRadio()

        println("Mesin telah mati")
    }

    AirConditioner getAirConditioner(){
        if (airConditioner == null){
            airConditioner = new AirConditioner()
        }
        return airConditioner
    }

    Radio getRadio(){
        if (radio == null){
            radio = new Radio()
        }
        return radio
    }

}

class AirConditioner {

    void turnOnAc(){
        println("Ac telah menyala")
    }

    void turnOffAc(){
        println("Ac telah mati")
    }

}

class Radio {

    void turnOnRadio(){
        println("Radio telah menyala")
    }

    void turnOffRadio(){
        println("Radio telah mati")
    }

    void changeRadioChannel(){
        println("Saluran radio telah berubah dari 12.1 fm menjadi 12.2 fm ")
    }


}



class SRight {

    static void main(String[] args) {
        Car2 car2 = new Car2()

        car2.turnOnEngine()
        car2.airConditioner.turnOnAc()
        car2.radio.turnOnRadio()
        car2.radio.changeRadioChannel()
        car2.turnOffEngine()

    }

}
