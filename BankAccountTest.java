package BankApplication;
import java.util.Scanner; // import scanner

/*
 * This program calls methods from another class to create a bank account that has the ability to make
 * withdrawals, deposits, and much more.
 */

public class BankAccountTest { // class for BankAccountTest

	public static void main(String[] args) { // main method
		
		Scanner input = new Scanner(System.in); // initialize scanner
		double dBalance = 0.0; // initialize balance variable
		double dIntRate = 0.0; // initialize interest rate variable
		double dDeposit = 0.0; // initialize deposit variable
		double dWithdrawal = 0.0; // initialize withdrawal variable
		int nMenuOption = 0; // initialize menu option variable
		BankAccount myBankAccount = null; // set BankAccount object to null
		
		System.out.println("ACCOUNT PROCESSING MENU"); // print menu
		System.out.println("1. Create new account – empty account"); // print menu
		System.out.println("2. Create new account – information available"); // print menu
		System.out.println("3. Make deposit"); // print menu
		System.out.println("4. Make withdrawal"); // print menu
		System.out.println("5. Calculate monthly interest"); // print menu
		System.out.println("6. View account balance"); // print menu
		System.out.println("7. Next available account number"); // print menu
		System.out.println("8. Update monthly interest rate"); // print menu
		System.out.println("9. Print account information"); // print menu
		System.out.println("10.Exit"); // print menu
		
		
		while(nMenuOption != 10) { // start while statement for menu option
			
			System.out.print("\nPlease enter your preferred option: "); // ask user for option
			nMenuOption = input.nextInt(); // scans option
			
			switch (nMenuOption) { // switch statement to use flow control
				case 1: // first case
					myBankAccount = new BankAccount(); // create new object with default constructor
					System.out.println("Account #" + myBankAccount.getAccountNumber() + // print account number
							" successfully created."); // print account number
					break; // case break
				
				case 2: // second case
					System.out.print("Please enter the starting balance: "); // ask user for starting balance
					dBalance = input.nextDouble(); // scan user input
					System.out.print("Please enter the monthly interest rate: "); // ask user for monthly interest rate
					dIntRate = input.nextDouble(); // scan user input
					myBankAccount = new BankAccount(dBalance, dIntRate); // create new object with overloaded constructor
					System.out.println("Account #" + myBankAccount.getAccountNumber() + // print account number
							" successfully created."); // print account number
					break; // case break
				
				case 3: // third case
					System.out.print("Please enter the deposit amount: "); // ask user for deposit amount
					dDeposit = input.nextDouble(); // scan user input
					myBankAccount.makeDeposit(dDeposit); // call deposit method
					break; // case break
					
				case 4: // fourth case
					System.out.print("Please enter the withdrawal amount: "); // ask user for withdrawal amount
					dWithdrawal = input.nextDouble(); // scan user input
					if (dWithdrawal > myBankAccount.getBalance()) { // if-statement to check if funds are available for withdrawal
						System.out.println("Insufficient funds. Withdrawal not made."); // print insufficient funds if not enough available
					} else { // else statement to make withdrawal
						myBankAccount.makeWithdrawal(dWithdrawal); // call makeWithDrawal method
					} // end else-statement
					break; // case break
					
				case 5: // fifth case
					System.out.println("Monthly interest earned: $" + myBankAccount.getMonthlyInterestRate()); // call monthly interest method to display
					break; // case break
					
				case 6: // sixth case
					System.out.println("Account balance: $" + myBankAccount.getBalance()); // call balance method to display account balance
					break; // case break
					
				case 7: // seventh case
					System.out.println("Next available account number is: " + myBankAccount.getNextAccountNumber()); // display next account number
					break; // case break
					
				case 8: // eighth case
					System.out.print("What is the new monthly interest rate? "); // ask user for new interest rate
					dIntRate = input.nextDouble(); // scan user input
					myBankAccount.setMonthlyInterestRate(dIntRate); // call method to set interest rate
					break; // case break
					
				case 9: // ninth case
					myBankAccount.printBankInfo(); // print account information
					break; // case break
				
				case 10: // tenth case
					System.out.println("Exiting program."); // display program exit
					break; // case break
	
				default: // default case
					System.out.println("Wrong data!"); // display wrong data if above cases are not met
					break; // case break
			
			} // end switch statement
			
		} // end while loop
		
	} // end main method

} // end BankAccountTest class
