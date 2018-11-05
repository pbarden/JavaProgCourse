/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;

import java.util.Arrays;

/**
 *
 * @author paulb
 */
public class ArrayEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ExampleArray = {1, 2, 3, 4, 5};
        int[] ReplacementArray = new int[4];
        System.arraycopy(ExampleArray, 1, ReplacementArray, 0, 4);
        ExampleArray = ReplacementArray;
        System.out.println(Arrays.toString(ExampleArray));

    }
    
}
