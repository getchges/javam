package question8;
public class NestedException
{
	public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // This will cause an ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
        	int a=10;
        	int b=0;
            try 
            {
                // Attempting to perform a division operation which may cause ArithmeticException
                
                int c=a/b;
                //System.out.println("division:"+c);
            } 
            catch (ArithmeticException ex) {
                // Handling the ArithmeticException and throwing a new exception with nested exception
                throw new RuntimeException("Nested Exception occurred", ex);
            }
        }
    }

    
}