package infiniteloop;

public class InfinteLoop {
    
    public static int total;

    public static void main(String args[]) {

        for(int x = 0; x <= 10; x++)  {
          
            System.out.println("x = " + x );
            total += (int) Math.sqrt(x * 2);
            x = 1;
        }
      
        System.out.println("total =  " + total);
    }   
}