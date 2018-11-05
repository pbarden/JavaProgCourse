/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newconditionexample;

/**
 *
 * @author paulb
 */
public class NewConditionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 50;

        //if (x == y && x != z) {
        //    x += 100;
        //} else {x += 10;}

        //System.out.println(x);

        int result = x==y && x!=z ? 100 : 10;
        x += result;

        System.out.println(x);    
        
        for(int i = 0; i <= z; i++) {
            z--;
            System.out.println("i = " + i);
            System.out.println("z = " + z);
        }
    }
    
}
