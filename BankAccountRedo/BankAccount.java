/**
 * BankAccount2.0
 */
public class BankAccount {

    private int nAccountNumber = 0;
    private static int nNextAccountNumber = 0;
    private String firstName = "";
    private String lastName = "";
    private String address = "";
    private int SSN = 0;
    private double deposit = 0.0;

    public BankAccount() {

        nNextAccountNumber++;
        nAccountNumber = nNextAccountNumber;

    }

    public BankAccount(int nAccountNumber, String firstName, String lastName, String address, int SSN, double deposit) {
        nNextAccountNumber++;
        nAccountNumber = nNextAccountNumber;

        this.nAccountNumber = nAccountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.SSN = SSN;
        this.deposit = deposit;
    // }

    public int getNAccountNumber() {
        return this.nAccountNumber;
    }

    public void setNAccountNumber(int nAccountNumber) {
        this.nAccountNumber = nAccountNumber;
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
        this.deposit = deposit;
    }

    public BankAccount nAccountNumber(int nAccountNumber) {
        this.nAccountNumber = nAccountNumber;
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

    // get first and last name
    // get address
    // get social security number
    // get deposit

    // set first and last name
    // set address
    // set social security number
    // set deposit

} // end class