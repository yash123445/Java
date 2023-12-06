import java.io.Serializable;
import java.util.*;
import java.io.Serializable;
public abstract class Account implements Serializable{
    private static int lastAccountNo = 1000;
    private String holderName;
    private int accountNo;
    private Date openDate;
    private Date closeDate;
    private String mobileNumber;
    private double balance;

    private String aadhar ;

    private String address;
    public String getHolderName() {
        return holderName;
    }
    public Account() {
        this.accountNo = AccountNumberGenerator.getNextAccountNumber();
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void openAccount();

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void calculateInterest();

    public abstract void displayTransaction();
}
