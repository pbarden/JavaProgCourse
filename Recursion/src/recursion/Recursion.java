/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author paulb
 */
class Recursion {
    public static void main(String[] args) {

        System.out.println("Factorial of 3 if " + fact(3));
        System.out.println("Factorial of 4 if " + fact(4));
        System.out.println("Factorial of 5 if " + fact(5));
    }

        static int fact(int n) {
            if(n==1) return 1;
            int result = fact(n-1)*n;
            return result;
        }
}