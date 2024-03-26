// 8. Write a 
//program to find the roots of a quadratic equation using interface and packages. ● Declare an interface in  package 
//Quad1 ● Declare another package Quad2 and implement the interface  

// Interface in the package Quad1
package Quad1;

public interface QuadraticEquation 
{
	
	void findRoots(double a, double b, double c);
	
}


______________________

// Implementation of the interface in the package Quad2
package Quad2;

import Quad1.QuadraticEquation;

class QuadraticSolution implements QuadraticEquation
{
	
	    @Override
	    public void findRoots(double a, double b, double c) 
	    {
	        double discriminant = b * b - 4 * a * c;
	        double root1, root2;

	        if (discriminant > 0) 
	        {
	            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Roots: " + root1 + ", " + root2);
	        } 
	        else if (discriminant == 0)
	        {
	            root1 = -b / (2 * a);
	            System.out.println("Root: " + root1);
	        } 
	        else 
	        {
	            double realPart = -b / (2 * a);
	            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
	            System.out.println("Roots: " + realPart + " + " + imaginaryPart + "i, " + realPart + " - " + imaginaryPart + "i");
	        }
	    }
}


public class QuadraticProcedure
{
    public static void main(String[] args)
    {
    	QuadraticSolution solver = new QuadraticSolution();
        solver.findRoots(1, -3, 2); // Quadratic equation: x^2 - 3x + 2 = 0
    }
}