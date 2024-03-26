//9. Program to implement all String methods on a Input String.  

import java.util.Scanner;
public class M3Q9 
{
    public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = scan.next();

        // String methods
        System.out.println("1. Uppercase: " + a.toUpperCase());
        System.out.println("2. Lowercase: " + a.toLowerCase());
        System.out.println("3. Trimmed: " + a.trim());
        System.out.println("4. Starts with : " + a.startsWith("Hello"));
        System.out.println("5. Ends with : " + a.endsWith("thi"));
        System.out.println("6. Character at index : " + a.charAt(2));
        System.out.println("7. Length: " + a.length());
        //System.out.println("8. Interned string: " + a.intern());

    }
}