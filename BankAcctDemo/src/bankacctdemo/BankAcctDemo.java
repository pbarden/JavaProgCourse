/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankacctdemo;

/**
 *
 * @author paulb
 */
public class BankAcctDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankAcct ba = new BankAcct("Eric Jones", 471347, 3500);
ba.deposit(50);
ba.withdraw(5000);
System.out.println(ba);
    }
    
}
