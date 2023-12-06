import java.util.*;

public class SavingAccount extends Account {
    private Date lastTransaction;

    public SavingAccount() {
        super();
        this.lastTransaction = new Date();
    }

    public Date getLastTransaction() {
        return lastTransaction;
    }

    private void updateLastTransDate() {
        lastTransaction = new Date();
    }

    Scanner sc = new Scanner(System.in);
    public static final double MINIMUM_BALANCE = 1000;

    public void openAccount() {
        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();
        setHolderName(name);
        System.out.println("Enter Mobile No: ");
        String mobile = sc.nextLine();
        System.out.println("Enter AAdhar No: ");
        String aadhar = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Your Saving Account is created ");
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println(amount + " is added in your Bank Account");
    }

    public void withdraw(double amount) {
        if ((getBalance() - amount) > SavingAccount.MINIMUM_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " is withdrawn from your Account");
        }
    }

    public void calculateInterest() {
        // Implement if needed
    }

    public void displayTransaction() {
        System.out.println("Transaction Details Of Your Current Account ");
        System.out.println("Account Number: " + getAccountNo());
        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Account Balance: " + getBalance());
        System.out.println("Last Transaction: " + getLastTransaction());
    }
}
