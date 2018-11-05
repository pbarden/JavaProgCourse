/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countup;

import java.util.Arrays;

/**
 *
 * @author paulb
 */
public class CountUp {

    /**
     * @param args the command line arguments
     */
    /**************************************************************************************
* Program:     PRG/420 Week 3
* Purpose:     Week 3 Coding Assignment
* Programmer:  D. Paul Barden
* Class:       PRG/420
* Creation Date:  07/29/18
******************************************************************************************
* Program Summary:   For, while, and do-while loops; nested loops
*
* For this assignment, you will add code to create:
*
* a for loop nested inside another for loop
* a while loop
* a do-while loop

*****************************************************************************************/

    public static void main(String[] args) {

        int totalI = 0;
        int totalJ = 0;
        int totalK = 0;
        int totalAll = 0;
        for(int i = 0; i <= 10; i++)
        {
                totalI++;
                totalAll++;
                for(int j = 0; j <= 10; j++)
                {
                    totalJ++;
                    totalAll++;
                        for(int k = 0; k <= 10; k++)
                        {
                            totalK++;
                            totalAll++;
                        }
                }
        }
        System.out.println("i = " + totalI);
        System.out.println("j = " + totalJ);
        System.out.println("k = " + totalK);
        System.out.println("total operations = " + totalAll);
        
        int[] ExampleArray = {1, 2, 3, 4, 5};
        int[] ReplacementArray = new int[4];
        System.arraycopy(ExampleArray, 1, ReplacementArray, 0, 4);
        System.out.println(Arrays.toString(ReplacementArray));
        

    }

}
