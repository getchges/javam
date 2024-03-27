// 4. Define a Interface Polygon in package pack1. create a class triangle from Polygon in  
//package pack4, override method to calculate area of the triangle and raise an exception if 
//it  is an equilateral triangle.  
//Note : Exception has to be defined in package pack3.  

package Pack1;

public interface polygon 
{
	

	double calculateArea();
	

}

________________________________________________________

package pack3;

public class EquilateralTriangleException extends Exception
{
	public EquilateralTriangleException(String message) 
	{
        super(message);
    }

}

________________________________________________________

package pack2;

import Pack1.polygon;
import pack3.EquilateralTriangleException;

public class Triangle implements polygon
{

	 private double side1;
	    private double side2;
	    private double side3;

	    public Triangle(double side1, double side2, double side3)
	    {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    @Override
	    public double calculateArea() {
	        double s = (side1 + side2 + side3) / 2;
	        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	        return area;
	    }

	    public void validateTriangle() throws EquilateralTriangleException 
	    {
	        if (side1 == side2 && side2 == side3) {
	            throw new EquilateralTriangleException("Equilateral triangle detected!");
	        }
	    }
}

________________________________________________________

package pack2;

import pack3.EquilateralTriangleException;

public class TraingleMainClass
{
	 public static void main(String[] args)
	 {
	        Triangle triangle = new Triangle(3, 4, 5);

	        try 
	        {
	            triangle.validateTriangle();
	            double area = triangle.calculateArea();
	            System.out.println("Area of the triangle: " + area);
	        }
	        catch (EquilateralTriangleException e) 
	        {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
}

	
