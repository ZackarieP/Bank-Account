package BankApplication;

/*
 * This class is used to reference in BankAccountTest.java to create bank accounts, deposit/withdrawal money, or even calculate
 * interest within the created account.
 */

public class BankAccount { // BankAccount class 
	
	private int nAccountNumber = 0; // initialize account number variable
	private static int nNextAccountNumber = 12345; // initialize incremented account number variable
	private double dBalance = 0.0; // initialize balance variable
	private double dMonthlyInterestRate = 0.0; // initialize monthly interest rate variable
	private double dNewMonthlyInterestRate = 0.0; // initialize new monthly interest rate variable

	public BankAccount() { // default constructor
		
		nAccountNumber = nNextAccountNumber; // set incremented account number equal to account number variable
		nNextAccountNumber++; // increment the new account number
	} // end default constructor
	
	public BankAccount(double dStartBalance, double dIntRate) { // overloaded constructor
		nAccountNumber = nNextAccountNumber; // set incremented account number equal to account number variable
		nNextAccountNumber++; // increment the new account number
		if (dStartBalance >= 0 || dIntRate >= 0) { // if-statement to make sure input is >= 0
			dBalance = dStartBalance; // set start balance to main balance variable
			dMonthlyInterestRate = dIntRate; // set interest rate to monthly interest rate variable
		} else { // else-statement print wrong data
			System.out.println("Wrong Data!"); // print wrong data
		} // end else-statement
	} // end overloaded constructor
	
	public int getAccountNumber() { // getter for account number
		return nAccountNumber; // return account number
	} // end getter for getAccountNumber
	
	
	public double getBalance() { // getter for balance
		return dBalance; // return balance
	} // end getter for getBalance
	
	
	public double getMonthlyInterestRate() { // getter for monthly interest rate
		return monthlyInterest(); // return monthly interest rate method
	} // end getter for getMonthlyInterestRate
	
	
	public void setMonthlyInterestRate(double dRate) { // setter for monthly interest rate
		if (dRate >= 0) { // if-statement to ensure rate is >= 0
			dMonthlyInterestRate = dRate; // set monthly interest rate from input
		} else { // else-statement for wrong data
			System.out.println("Wrong data!"); // print wrong data
		} // end else-statement
	} // end setter for setMonthlyInterestRate
	
	
	public int getNextAccountNumber() { // getter for next account number
		return nNextAccountNumber; // return next account number
	} // end getter for getNextAccountNumber
	
	
	public void printBankInfo() { // method to print account info
		System.out.println("Account number: " + getAccountNumber()); // print account number
		System.out.println("Account balance: $" + getBalance()); // print account balance
		System.out.println("Monthly interest: $" + getMonthlyInterestRate()); // print monthly calculated interest
	} // end printBankInfo method
	
	
	public void makeDeposit(double dDepositAmt) { // method to make a deposit
		dBalance += dDepositAmt; // add deposit to balance
	} // end makeDeposit method
	
	
	public void makeWithdrawal(double dWithdrawalAmt) { // method to make a withdrawal
		dBalance -= dWithdrawalAmt; // subtract withdrawal from balance
		System.out.println("Withdrawal successful"); // print withdrawal was successful
	} // end makeWithdrawal method
	
	
	public double monthlyInterest() { // calculate monthly interest
		dNewMonthlyInterestRate = getBalance() * dMonthlyInterestRate; // calculation of monthly interest
		return dNewMonthlyInterestRate; // return calculated monthly interest
	} // end monthlyInterest method
	
	
} // end BankAccount class
