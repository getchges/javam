//9. Create an Account class with data members accno, name,bal. Include methods 
//deposit(),  withdraw(). Raise an exception when balance in account is less than 1000.

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int accNo;
    private String name;
    private double balance;

    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < 1000) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account(123456, "John Doe", 1500);
        
        try {
            account.withdraw(800); // Should succeed
            account.withdraw(800); // Should throw InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
