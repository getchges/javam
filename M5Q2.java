//2.Program to create a user defined package in Java.   

package question2;

public class UserPackage
{

    public void display()
    {
        System.out.println("This is a method from UserPackage in eshwar1_package");
    }

}

________________________________________________________

package question2;

public class UserPackageMainclass 
{

	    public static void main(String[] args)
	    {
	        UserPackage obj = new UserPackage();
	        obj.display();
	    }
}

