/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarrayclass;

import java.util.*;

/**
 *
 * @author paulb 
 */
public class MyArrayClass {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> shinyNewArrayList = new ArrayList<Integer>(); 
        
	Collections.sort(shinyNewArrayList);
        
        Collections.addAll(shinyNewArrayList, 5, 10, 15, 11, 1, 2, 3, 4);

        System.out.println("Here is the order in which array elements were created: " + shinyNewArrayList);

        Collections.sort(shinyNewArrayList);

        System.out.println("After sorting, the current student list is: " + shinyNewArrayList);

        System.out.println("Here is the order of array elements AFTER sorting: " + shinyNewArrayList);
    }
    
}
