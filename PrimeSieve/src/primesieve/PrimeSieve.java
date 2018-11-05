/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primesieve;
import java.util.Scanner;
/**
 *
 * @author paul barden
 */
public class PrimeSieve {
    public static void main(String[] args) { 
        int highest = Integer.MAX_VALUE;

        System.out.print("Please enter a positive integer less than " + highest + " for best results: ");
        
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor*factor <= n; factor++) {

            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        int primeCounter = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primeCounter++;
            if (isPrime[i] == true) System.out.println(i + " is a prime number");
        }
        System.out.println("There are " + primeCounter + " prime numbers <= " + n);

    }
}