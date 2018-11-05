package myboxdemo;

/**
 * @author paulb
 */
public class Box {

    // variables the class uses
    double width;
    double height;
    double depth;
    double volume;
    
    // the default constructor
    Box() {
        
    }
    
    // constructor with three arguments
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // method that sets the dimensions when invoked
    void setDimensions (int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    // returns double when invoked, w * h * d
    double volume() {
        return width * height * depth;
    }
    
    // method that prints the volume
    void getVolume() {
        System.out.println("Volume is " + volume());
    }
    
}