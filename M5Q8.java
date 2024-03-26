//8. Program to demonstrate nested exception.

package question8;
public class NestedException
{
	
	
	
	// Method to perform division
    public static int divide(int num, int den) {
        return num / den;
    }
    
	
    public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // This will cause an ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            try 
            {
                // Attempting to perform a division operation which may cause ArithmeticException
                int result = divide(10, 0);
                System.out.println("Result of division: " + result);
            } 
            catch (ArithmeticException ex) {
                // Handling the ArithmeticException and throwing a new exception with nested exception
                throw new RuntimeException("Nested Exception occurred", ex);
            }
        }
    }

    
}
