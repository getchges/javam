//9. Write a Program to generate Fibonacci Series by using Constructor to initialize the Data Members.  

class FibonacciSeries {
    private int n;

    // Constructor to initialize the number of terms in the Fibonacci series
    public FibonacciSeries(int n) {
        this.n = n;
    }

    // Method to generate and print Fibonacci series
    public void generateSeries() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        FibonacciSeries fibSeries = new FibonacciSeries(10); // Generate Fibonacci series with 10 terms
        fibSeries.generateSeries();
    }
}
