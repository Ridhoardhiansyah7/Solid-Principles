package com.onedive.learn.solid.l

/*
Class ini adalah contoh class yg mengikuti prinsip liskov substitution dikarnakah
setiap sub class memiliki prilaku yg sama seperti pada super class
 */
abstract class Robot {

    abstract void fly()

    abstract void walk()

    abstract void eat()
}

class CheapRobot extends Robot{

    @Override
    void fly() {
        println("Robot sedang terbang dengan kecepatan 10 m/s")
    }

    @Override
    void walk() {
        println("Robot sedang berjalan lambat")
    }

    @Override
    void eat() {
        println("Robot sedang makan dengan porsi yang sangat banyak")
    }
}

class ExpensiveRobot extends Robot{

    @Override
    void fly() {
        println("Robot sedang terbang dengan kecepatan cahaya")
    }

    @Override
    void walk() {
        println("Robot sedang berjalan dengan kecepatan lumayan cepat")
    }

    @Override
    void eat() {
        println("Robot sedang makan dengan porsi sedikit ")
    }

}

class LRight {

    static void main(String[] args) {

        Robot robot = new CheapRobot()
        robot.fly()
        robot.eat()
        robot.walk()

        println("==========================")

        robot = new ExpensiveRobot()
        robot.fly()
        robot.eat()
        robot.walk()

    }

}
