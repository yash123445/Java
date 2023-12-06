import java.util.*;
public class CurrentAccount extends Account{
    private Date lastTransaction;

    public CurrentAccount() {
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
    @Override
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
        System.out.println("Current Account is Opened :)");
    }

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " is deposited in your account");
        setBalance(getBalance()+ amount);
        updateLastTransDate();
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()> amount) {
            setBalance(getBalance()- amount );
            System.out.println(amount + " withdraw from your current acoount ");
        }else {
            System.out.println("Insuffiecient balance in account ");
        }

    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void displayTransaction() {
        System.out.println("Transaction Details Of Yoour Current Acoount ");
        System.out.println("Account Number: "+ getAccountNo());
        System.out.println("Holder Name: "+ getHolderName());
        System.out.println("Account Balance: "+ getBalance());
        System.out.println("Last Transaction: "+ getLastTransaction());
    }
}
