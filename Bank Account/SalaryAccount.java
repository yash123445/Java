import java.util.*;

public class SalaryAccount extends SavingAccount {
    private Double salary;
    private Date lastTransaction;
//    private static int lastAccountNo = 1000; // Static variable to keep track of the last assigned account number

    public SalaryAccount() {
        super();
        this.lastTransaction = new Date();
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void openAccount() {

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();
        setHolderName(name);

        System.out.println("Enter Mobile No: ");
        String mobile = sc.nextLine();

        System.out.println("Enter Aadhar No: ");
        String aadhar = sc.nextLine();

        System.out.println("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("Enter Employee Id: ");
        String eid = sc.nextLine();

        System.out.println("Your Salary Account is Opened :)");
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println(amount + " is deposited in your salary account");
        updateLastTransDate();
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() - amount) >= SavingAccount.MINIMUM_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " is withdrawn from your salary account ");
            updateLastTransDate();
        } else {
            System.out.println("Insufficient Balance in account");
        }
    }

    @Override
    public void calculateInterest() {
        // Implement if needed
    }

    @Override
    public void displayTransaction() {
        System.out.println("Transactions Of Your Salary Account are ");
        System.out.println("Account No: " + getAccountNo());
        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Balance In Account: " + getBalance());
        System.out.println("Last Transaction Date: " + getLastTransaction());
    }

    public Date getLastTransaction() {
        return lastTransaction;
    }

    private void updateLastTransDate() {
        lastTransaction = new Date();
    }

    public boolean isFrozen() {
        Date currentDate = new Date();
        long diffInMilliseconds = currentDate.getTime() - lastTransaction.getTime();
        long diffDate = (diffInMilliseconds) / (24 * 60 * 60 * 1000);
        return diffDate > 60;
    }
}
