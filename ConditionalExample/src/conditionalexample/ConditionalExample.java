/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalexample;

/**
 *
 * @author paulb 
 */

public class ConditionalExample {
    
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 5;

        if (x == y && x != z) {
            x += 100;
        } else {x += 10;}

        System.out.println(x);

        int result = x==y && x!=z ? 100 : 10;
        x += result;

        System.out.println(x);
    }
}