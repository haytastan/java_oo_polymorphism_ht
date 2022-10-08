package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on $DATE
 **/

/*
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Inheritance lets us inherit attributes and methods from another class.
Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound().
Subclasses of Animals could be Cat, Dog, etc.
And they also have their own implementation of an animal sound (the cat meows, and the cat meows, etc.)
OVERRIDING CONSTRACTOR METHOD (DEFINING THE METHOD IN SUPER-CLASS WITH DIFFERENT ACTIONS IN SUB-CLASSES)
OVERLOADING CONSTRACTOR METHOD (DEFINING THE METHOD IN SUPER-CLASS WITH DIFFERENT PARAMETERS IN SUB-CLASSES)
*/


public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a cat object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
