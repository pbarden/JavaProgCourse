/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

/**
 *
 * @author paulb
 */
// Animal is an abstract class because "animal" is conceptual
// for our purposes. We can't declare an instance of the Animal class,
// but we will be able to declare an instance of any concrete class
// that derives from the Animal class.
abstract class Animal {

    // All animals have a name, so store that info here in the superclass.
    // And make it private so that other programmers have to use the
    // getter method to access the name of an animal.
    private final String animalName;

    // One-argument constructor requires a name.
    public Animal(String aName) {
    animalName = aName;
    }

    // Return the name of the animal when requested to do so via this 
    // getter method, getName().
    public String getName() {
    return animalName;
    }

    // Declare the makeSound() method abstract, as we have no way of knowing
    // what sound a generic animal would make (in other words, this
    // method MUST be defined differently for each type of animal,
    // so we will not define it here--we will just declare a placeholder
    // method in the animal superclass so that every class that derives from
    // this superclass will need to provide an override method
    // for makeSound()).
    public abstract String makeSound();	
};
