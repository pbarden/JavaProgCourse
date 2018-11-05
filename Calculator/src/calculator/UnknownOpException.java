/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author paulb
 */
public class UnknownOpException extends Exception
{
    public UnknownOpException()
    {
        super("UnknownOpException");
    }
    
    public UnknownOpException(char op)         
    {                                          
        super(op + " is an unknown operator.");
    }
    public UnknownOpException(String message)
    {
        super(message);
    }
}
