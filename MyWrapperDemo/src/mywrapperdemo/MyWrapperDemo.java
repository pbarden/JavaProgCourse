/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywrapperdemo;

/**
 *
 * @author paulb
 */
public class MyWrapperDemo {

    /**
     * SImply shows the max and min values of each data type
     */
    public static void main(String[] args) {
        // Byte
        System.out.println("The max value for Byte is: " + Byte.MAX_VALUE); //127
        System.out.println("The min value for Byte is: " + Byte.MIN_VALUE); //-128
        // Short
        System.out.println("The max value for Short is: " + Short.MAX_VALUE); //32767
        System.out.println("The min value for Short is: " + Short.MIN_VALUE); ////-32768
        // Integer
        System.out.println("The max value for Integer is: " + Integer.MAX_VALUE); //2147483647
        System.out.println("The min value for Integer is: " + Integer.MIN_VALUE); //-2147483648
        // Float
        System.out.println("The max value for Float is: " + Float.MAX_VALUE); //3.4028235E38
        System.out.println("The min value for Float is: " + Float.MIN_VALUE); //1.4E-45
        // Double
        System.out.println("The max value for Double is: " + Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println("The min value for Double is: " + Double.MIN_VALUE); //4.9E-324
    }
    
}
