/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdasomething;

/**
 *
 * @author paulb
 */
public class LambdaSomething {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Something.getSomething();
    }
    
}

class Something {
	public static Something getSomething() {
		return () -> { System.out.println("Hello"); };
	}
}