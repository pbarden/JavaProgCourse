/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypets;

/**
 *
 * @author paulb
 */
public class MyPets {
    
    public static void main(String[] args) {
        System.out.println("A list of pets I own:");
        int[] pets = null;
        pets [0] = 1;
        pets [1] = 2;
        pets [2] = 3;
        pets [3] = 4;
        pets [4] = 5;
        pets [5] = 6;
        pets [6] = 7;
        
        for (int i = 0; i < pets.length; i++) {
            System.out.print("\nPet No. " + i + ": " + pets[i]);
        }
    }
}
