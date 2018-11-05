package myboxdemo;

/**
 * @author paulb
 */
public class MyBoxDemo {

    public static void main(String[] args) {

        // creates boxes using the Box object
        Box firstBox =  new Box();
        Box secondBox = new Box();
        Box thirdBox = secondBox;
        Box fourthBox = new Box(2, 4, 6);
        
        // uses the method getVolume() to return print the volume on the console
        // also used to show values after using declaration methods above
        firstBox.getVolume();
        secondBox.getVolume();
        thirdBox.getVolume();
        fourthBox.getVolume();
        
        // use the mutator method to set the dimensions
        firstBox.setDimensions(10, 20, 15);
        secondBox.setDimensions(3, 6, 9);
        
        // getVolume() method again, used to show the change in each
        firstBox.getVolume();
        secondBox.getVolume();
        thirdBox.getVolume();
        fourthBox.getVolume();
        
        // set other variables to values using the volume() method
        // which returns the same type of data as the variable declared here
        double vol1 = firstBox.volume();
        double vol2 = secondBox.volume();
        double vol3 = thirdBox.volume();
        double vol4 = fourthBox.volume();
        
        // uses the methods defined below, each with different arguments
        println("Volume is " + vol1);
        println("Volume is " + vol2);
        println("Volume is " + vol3);
        println(vol1 + vol2 + vol3);
        println(vol4);
        
        println(pow(5, 1));
        println(pow(5, 2));
        println(pow(5, 3));
        println(pow(5, 4));
        println(pow(5, 5));
               
    }
    
    static double pow(double base, double exponent) {
        double total = base;

        for(int start = 1; start < exponent; start++) {
            total *= base;
        }
        return total;
    }
    
    // just created these to make the coding easier to type and read
    static void println(String stringEntry) {

        System.out.println(stringEntry);
        
    }
    
    // made another with different argument
    static void println(double doubleEntry) {

        //formatted to match the other statements above
        System.out.println("Volume is " + doubleEntry);
        
    }
        
}
