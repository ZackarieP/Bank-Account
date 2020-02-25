import java.util.*;

/**
 * BankAccountMainV2
 */

public class BankAccountMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount userBankAccount = null;

        int userOption = 0;
        int accountNum = 0;
        String firstName = "";
        String lastName = "";
        String address = "";
        int SSN = 0;
        double deposit = 0.0;
        double withdrawal = 0.0;
        double balance = 0.0;

        System.out.println("ACCOUNT PROCESSING MENU"); // print menu
        System.out.println("1. Create new account Bank empty account"); // print menu
        System.out.println("2. Create new account Bank w/information available"); // print menu
        System.out.println("3. Make deposit"); // print menu
        System.out.println("4. Make withdrawal"); // print menu
        System.out.println("5. View account balance"); // print menu
        System.out.println("6. Print account information"); // print menu
        System.out.println("10.Exit"); // print menu

        while (userOption != 10) {

            System.out.print("\nPlease enter your preferred option: ");
            userOption = input.nextInt();

            switch (userOption) {
                case 1:
                    userBankAccount = new BankAccount();
                    System.out.println("You have just created a new account!\nAccount Number: "
                            + userBankAccount.getAccountNumber());
                    break;
                case 2:

                    userBankAccount = new BankAccount(accountNum, firstName, lastName, address, SSN, deposit,
                            withdrawal, balance);
                    System.out.println("Account Number: " + userBankAccount.getAccountNumber());

                    System.out.print("First Name: ");
                    firstName = input.nextLine();
                    userBankAccount.setFirstName(firstName);

                    input.nextLine();

                    System.out.print("Last Name: ");
                    lastName = input.nextLine();
                    userBankAccount.setLastName(lastName);

                    System.out.print("Address: ");
                    address = input.nextLine();
                    userBankAccount.setAddress(address);

                    System.out.print("SSN: ");
                    SSN = input.nextInt();
                    userBankAccount.setSSN(SSN);

                    System.out.print("First Deposit: ");
                    deposit = input.nextInt();
                    if (deposit >= 0) {
                        userBankAccount.setDeposit(deposit);
                    } else {
                        System.out.println("Deposit cannot be less than 0!");
                    }

                    break;

                case 3:
                    System.out.print("How much would you like to deposit in your account: ");
                    deposit = input.nextDouble();
                    userBankAccount.setDeposit(deposit);
                    break;

                case 4:
                    System.out.println("How much would you like to withdrawal from your account: ");
                    withdrawal = input.nextDouble();
                    userBankAccount.setWithdrawal(withdrawal);
                    break;

                case 5:
                    System.out.println("Account Number: #" + userBankAccount.getAccountNumber());
                    System.out.println("Account Balance: $" + userBankAccount.getBalance());
                    break;

                case 6:
                    userBankAccount.printInfo();
                    break;

                default:
                    break;
            } // end switch statement

        } // end while loop

        input.close(); // close scanner

    } // end main method

} // end class