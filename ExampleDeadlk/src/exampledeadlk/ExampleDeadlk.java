/**********************************************************************
*	Program:	Week 4 Analyze a Multithreaded Program
* 	Purpose: 	Review the code and predict the results for the program execution.
* 	Programmer:	Iam A. student
*	Class:	PRG/421r13, Java Programming II
*	Instructor:	xxx
*	Creation Date:	12/28/2017	*
***********************************************************************/
package exampledeadlk;

public class ExampleDeadlk {
    public static Object Lock1 = new Object();	// aacquires lock on the Lock1 object
    public static Object Lock2 = new Object();	// aacquires lock on the Lock2 object

    public static void main(String args[]) {
        ThreadDemo1 T1 = new ThreadDemo1();	// define the new threads
        ThreadDemo2 T2 = new ThreadDemo2();	// and set name for the threads
        T1.start();
        T2.start();
    }

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {

                // synchronized  Lock1 and Lock 2 will hold the thread until release

                System.out.println("Thread 1: Holding lock 1...");

                try { Thread.sleep(10); }	// pause for 10 secs, then access thread 
                catch (InterruptedException e) {}	// if exception happens, “catch it”
                System.out.println("Thread 1: Waiting for lock 2...");  	// display wait condition

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try { Thread.sleep(10); }	// pause for 10 secs, then access thread 
                catch (InterruptedException e) {}	// if exception happens, “catch it”
                System.out.println("Thread 2: Waiting for lock 1..."); 	// display wait condition

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
