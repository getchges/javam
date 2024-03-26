//1. Program to demonstrate the visibility of members in subclasses of same and 
//different  packages. 

package question1;

public class Q1 
{
	 private int privateField;
	 int defaultField;
	 protected int protectedField;
	 public int publicField;

	 private void privateMethod()
	 {
	     System.out.println("Private Method");
	 }
	
	 void defaultMethod()
	 {
	     System.out.println("Default Method");
	 }
	
	 protected void protectedMethod() 
	 {
	     System.out.println("Protected Method");
	 }
	
	 public void publicMethod() 
	 {
	     System.out.println("Public Method");
	 }
	
}

________________________________________________________


package question1;

public class SubClassQ1 extends Q1
{
	
	    public void accessFieldsAndMethods() 
	    {
	        // Accessing fields
	        // privateField not accessible
	        // defaultField not accessible
	        System.out.println(protectedField); // Accessible
	        System.out.println(publicField);    // Accessible

	        // Accessing methods
	        // privateMethod() not accessible
	        // defaultMethod() not accessible
	        protectedMethod(); // Accessible
	        publicMethod();    // Accessible
	    }
}


________________________________________________________


package question1anotherpackage;

import question1.Q1;

public class SubClassOfQ1_anotherPackage extends Q1
{ 
	 public void accessFieldsAndMethods() 
	 {
	     // Accessing fields
	     // privateField not accessible
	     // defaultField not accessible
	     // protectedField not accessible
	     System.out.println(publicField); // Accessible
	
	     // Accessing methods
	     // privateMethod() not accessible
	     // defaultMethod() not accessible
	     // protectedMethod() not accessible
	     publicMethod(); // Accessible
	 }

}


________________________________________________________


package question1;

import question1anotherpackage.SubClassOfQ1_anotherPackage;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("SubclassQ1 in the Same Package as question1:");
        SubClassQ1 subclassq1 = new SubClassQ1();
        subclassq1.accessFieldsAndMethods();
        System.out.println("***************************");
        System.out.println("\nSubclass in a Different Package from :");
        SubClassOfQ1_anotherPackage sub = new SubClassOfQ1_anotherPackage();
        sub.accessFieldsAndMethods();
    }
}


