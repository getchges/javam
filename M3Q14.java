//14. Program to count the number of occurrences of a search string in a given text string 

public class M3Q14 
{
	
	    public static int countOccurrences(String text, String searchString) 
	    {
	        int count = 0;
	        int index = text.indexOf(searchString);
	        while (index != -1) 
	        {
	            count++;
	            index = text.indexOf(searchString, index + searchString.length());
	        }
	        return count;
	    }

	    public static void main(String[] args) 
	    {
	        String text = "This is a test string. It contains test multiple test occurrences.";
	        String searchString = "test";

	        int count = countOccurrences(text, searchString);
	        System.out.println("Number of occurrences of \"" + searchString + "\": " + count);
	    }
}


