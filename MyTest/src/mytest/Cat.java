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
// Create a concrete subclass named "Cat" that inherits from Animal.
// Because Cat is a concrete class, we can instantiate it.
class Cat extends Animal {

// This constructor passes the name of the cat on to the Animal
// superclass to deal with.
public Cat(String nameOfCat) {
    super(nameOfCat);
    }

    // This method is Cat-specific.
    @Override
    public String makeSound() {
    return ("Meow");
    }

}


