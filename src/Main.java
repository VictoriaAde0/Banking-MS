import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem();

        while (true) {
            System.out.println("Banking Account Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Update Balance");
            System.out.println("3. Add Transaction");
            System.out.println("4. Get Transaction History");
            System.out.println("5. List Accounts");
            System.out.println("6. Manage Customer Information");
            System.out.println("7. Exit");

            System.out.println("Select an option");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    Account acc = new Account();
                    bankingSystem.createAccount(acc);

                    System.out.println("Please enter account number \n");
                    int accountNumber = scanner.nextInt();
                    acc.setAccountNumber(accountNumber);

                    System.out.println("Please enter your name \n");
                    String customerName = scanner.nextLine();
                    acc.setCustomerName(customerName);

                    System.out.println("Please enter balance \n");
                    double balance = scanner.nextDouble();
                    acc.setBalance(balance);

                    System.out.println("Please enter Account Type \n");
                    String accountType = scanner.nextLine();
                    acc.setAccountType(accountType);

                    break;

                case 2:

                    System.out.println("Enter Account Number: ");
                    int accountToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Amount to Update: ");
                    double amountToUpdate = scanner.nextDouble();
                    scanner.nextLine();
                    bankingSystem.updateBalance(accountToUpdate,amountToUpdate);
                    break;

                case 3:
                    Transaction transaction = new Transaction();


                    System.out.println("Please enter id number \n");
                    int id = scanner.nextInt();
                    transaction.setId(id);

                    System.out.println("Please enter date \n");
                    int date = scanner.nextInt();
                    transaction.setDate(date);

                    System.out.println("Please enter the amount \n");
                    int amount = scanner.nextInt();
                    transaction.setDate(amount);

                    System.out.println("Please enter the Transaction Type \n");
                    String transactionType = scanner.nextLine();
                    transaction.setTransactionType(transactionType);

                    System.out.println("Please enter the description \n");
                    String description = scanner.nextLine();
                    transaction.setDescription(description);


                    break;

                case 4:
                    System.out.println("Enter Account Number: ");
                    int accountNumberForHistory = scanner.nextInt();
                    scanner.nextLine();


                    break;

                case 5:
                    bankingSystem.listAllAccount();
                    break;

                case 6:
                    System.out.println("Thank you for banking with us");

                case 7:
                    System.out.println("You are now leaving");
                    System.exit(0);
                default:
                    System.out.println("Invalid, Please re-enter");


            }
        }


    }
}