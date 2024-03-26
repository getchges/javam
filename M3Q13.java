//13. Program to read a string and replace all the vowels with a ‘$’ symbol.  

import java.util.Scanner;
public class M3Q13 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        // Replace vowels with '$'
        String s1= s.replaceAll("[aeiouAEIOU]", "\\$");

        System.out.println("Modified string: " + s1);
    }
}

