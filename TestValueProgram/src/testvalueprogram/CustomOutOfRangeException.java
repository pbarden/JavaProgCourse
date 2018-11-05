package testvalueprogram;

public class CustomOutOfRangeException extends Exception
{
    public CustomOutOfRangeException ()
    {

    }
    public CustomOutOfRangeException (String message) {
        super (message);
    }

}