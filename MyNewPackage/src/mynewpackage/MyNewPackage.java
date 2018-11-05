package mynewpackage;

//Import the java library java.util.Scanner.
import java.util.Scanner;

public class MyNewPackage {

    public static void main(String[] args) {

    //Create a Scanner instance and populate it using the Scanner's next() method, similar to the code in the Week One Individual Assignment, Analyzing a Simple Java™ Program.
    Scanner myKeyboard = new Scanner(System.in);
    String myString = myKeyboard.next();

    //Convert the user input, which will come in as a string, to an integer using the Integer.parseInt() method.
    int myInteger = Integer.parseInt(myString);
    System.out.println(myInteger);

    }
}