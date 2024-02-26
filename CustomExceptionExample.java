public class CustomExceptionExample
{
    public static void main(String[] args)
    {
        try
        {
            int num = 10;
            int den = 0;
            if(den == 0)
                throw new DivisionByZeroException("Division by zero not allowed");
            int result = num/den;
            System.out.println("Result of division: "+result);
        }
        catch(DivisionByZeroException e)
        {
            System.out.println("Error"+e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error"+e.getMessage());
        }
        finally 
        {
            System.out.println("Finally block executed");
        }
    }    
}
