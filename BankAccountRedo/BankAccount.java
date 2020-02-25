import java.util.*;

/**
 * BankAccount2.0
 */
public class BankAccount {

    private int accountNum = 0;
    private static int nextAccountNum = 0;
    private String firstName = "";
    private String lastName = "";
    private String address = "";
    private int SSN = 0;
    private double deposit = 0.0;
    private double withdrawal = 0.0;
    private double balance = 0.0;
    ArrayList<Integer> listAccountNum = null;

    public BankAccount() {

        nextAccountNum++;
        accountNum = nextAccountNum;
        // listAccountNum.add(accountNum);
    } // default constructor

    public BankAccount(int accountNum, String firstName, String lastName, String address, int SSN, double deposit,
            double withdrawal, double balance) {
        nextAccountNum++;
        // listAccountNum.add(accountNum);

        this.accountNum = nextAccountNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.SSN = SSN;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
    } // overloaded constructor

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawal() {
        return this.withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        balance -= withdrawal;
    }

    public int getAccountNumber() {
        return this.accountNum;
    }

    public void setNAccountNumber(int nAccountNumber) {
        this.accountNum = nAccountNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return this.SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public double getDeposit() {
        return this.deposit;
    }

    public void setDeposit(double deposit) {
        balance += deposit;
    }

    public BankAccount nAccountNumber(int nAccountNumber) {
        this.accountNum = nAccountNumber;
        return this;
    }

    public BankAccount firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BankAccount lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BankAccount address(String address) {
        this.address = address;
        return this;
    }

    public BankAccount SSN(int SSN) {
        this.SSN = SSN;
        return this;
    }

    public BankAccount deposit(double deposit) {
        this.deposit = deposit;
        return this;
    }

    public void printInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("SSN: " + getSSN());
        System.out.println("Balance: $" + getBalance());
    }

} // end class