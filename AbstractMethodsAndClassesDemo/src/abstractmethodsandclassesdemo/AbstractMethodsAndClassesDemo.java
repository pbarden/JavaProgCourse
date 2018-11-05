/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmethodsandclassesdemo;

public class AbstractMethodsAndClassesDemo {

    public static void main(String[] args)  {
    
        B b = new B();     // class B reference and object
        
        b. demoabst ();   // reference demoabst object
        
        for (int height = 4; height >= 0; height--)
{
     for (int x = height; x >= 0; x--)
          System.out.print('*');
     System.out.println();
}
        String str = "myStringThing";
        int num = 2;
while (num != 0)
{
 num /= 2;
 System.out.println(num);
}




        
    }
}

abstract class A {

    abstract void demoabst();

}

class B extends A {    // subclass B derives from A
    
    void demoabst ()  {
    
        System.out.println("This is a code demo.");
    
    }
}