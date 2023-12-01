package com.onedive.learn.solid.i

/*
Class ini menyalahi aturan interface segregation dikarnakan pada class DuckToy class tsb dipaksa
untuk mengimplementasikan method eat yg mana maninan bebek tidak akan bisa makan
 */

interface Animal {
    void eat()
    void makeSound()
}

class Duck implements Animal {

    @Override
    void eat() {
        println("Bebek sedang makan ")
    }

    @Override
    void makeSound() {
        println("Bek bek bek")
    }
}

class DuckToy implements Animal {

    @Override
    void eat() {
        // do nothing
    }

    @Override
    void makeSound() {
        println("Bek bek bek")
    }
}



class IWrong {

    static void main(String[] args) {
        Animal animal = new Duck()
        animal.eat()
        animal.makeSound()

        animal = new DuckToy()
        animal.eat()
        animal.makeSound()

    }

}
