/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point2ddemo;

/**
 *
 * @author paulb
 */
public class Point2DDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Your program's main method contains the following code:

        Point2D pt = new Point2D(4, 8);
        pt.move(-3, 7);
        pt.moveTo(-3, 7);
        pt.move(-3, 7);
        System.out.println(pt);
    }
    
}
