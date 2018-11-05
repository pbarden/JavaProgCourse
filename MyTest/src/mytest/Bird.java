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
class Bird extends Animal {

// This constructor passes the name of the bird on to the Animal
// superclass to deal with.
public Bird (String nameOfBird) {
    super(nameOfBird);
    }

    // This method is Bird-specific.
    @Override
    public String makeSound() {
    return ("Squawk");
    }

}
