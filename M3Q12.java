//12. Program to reverse the words in a string.  

public class M3Q12 
{
	public static void main(String[] args) 
    {
        String s= "i like this program very much";
        String[] s1 = s.split(" "); // Split the string by space
        String reversed = "";
        for (int i = s1.length - 1; i >= 0; i--) 
        {
            reversed += s1[i] + " "; // Append each word in reverse order
        }
        System.out.println(reversed.trim()); // Print the reversed string
    }
}

