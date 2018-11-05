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
// Create a concrete subclass named "Dog" that inherits from Animal.
// Because Dog is a concrete class, we can instantiate it.
class Dog extends Animal {

// This constructor passes the name of the dog to
// the Animal superclass to deal with.
public Dog(String nameOfDog) {
    super(nameOfDog);
    }

    // This method is Dog-specific.
    @Override
    public String makeSound() {
    return ("Woof"); 
    }
} 
