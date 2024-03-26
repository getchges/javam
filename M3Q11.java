//11. Program to read and print a given string using different methods.   

import java.util.Scanner;
public class M3Q11
{
	    public static void main(String[] args)
	    {
	        int id;
	        String name;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter Employee ID: ");
	        id = scan.nextInt();
	        System.out.print("Enter Employee Name: ");
	        name = scan.next();
	        System.out.println("ID: " + id + "\nName: " + name);
	    }
}