package Main;

import Bank.Bank;
import Customer.Customer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Banking System Application ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Perform Transaction");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter customer contact information: ");
                    String contactInfo = scanner.nextLine();

                    Customer customer = new Customer(customerId, customerName, contactInfo);
                    bank.addCustomer(customer);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter customer ID: ");
                    int accountId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    bank.createAccount(accountNumber, accountId);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Is this a deposit? (true/false): ");
                    boolean isDeposit = scanner.nextBoolean();

                    bank.performTransaction(accNumber, amount, isDeposit);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accountNum = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    bank.displayAccountDetails(accountNum);
                    break;

                case 5:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
