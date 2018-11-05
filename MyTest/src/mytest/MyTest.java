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
public class MyTest {
    public static void main(String[] args) {

    // Create an instance of the Dog class, passing it the name "Spot."  
    // The variable aDog that we create is of type Animal.
    Animal aDog = new Dog("Spot");

    // Create an instance of the Cat class, passing it the name "Fluffy."  
    // The variable aCat that we create is of type Animal.
    Animal aCat = new Cat("Fluffy");

    // Create an instance of (instantiate) the Bird class.
    Animal aBird = new Bird("Tweety");

    //Exercise two different methods of the aDog instance:
    // 1) getName() (which was defined in the abstract Animal class)
    // 2) makeSound() (which was defined in the concrete Dog class)
    System.out.println("The dog named " + aDog.getName() + " will make this sound: " + aDog.makeSound());

    //Exercise two different methods of the aCat instance:
    // 1) getName() (which was defined in the abstract Animal class)
    // 2) makeSound() (which was defined in the concrete Cat class)
    System.out.println("The cat named " + aCat.getName() + " will make this sound: " + aCat.makeSound());

    System.out.println("The bird named " + aBird.getName() + " will make this sound: " + aBird.makeSound());
    }
}
