import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        int choice;

        do {
            System.out.println("Welcome to the Bank !!! What do you want? ");
            System.out.println("1. Open Account ");
            System.out.println("2. Transaction ");
            System.out.println("3. Display Transaction");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Which type of account do you want to open?");
                    System.out.println("1. Saving Account");
                    System.out.println("2. Salary Account");
                    System.out.println("3. Current Account");
                    System.out.print("Enter your choice: ");
                    int accountType = sc.nextInt();
                    switch (accountType) {
                        case 1:
                            SavingAccount a1 = new SavingAccount();
                            a1.openAccount();
                            accounts.add(a1);
                            break;
                        case 2:
                            SalaryAccount a2 = new SalaryAccount();
                            a2.openAccount();
                            accounts.add(a2);
                            break;
                        case 3:
                            CurrentAccount a3 = new CurrentAccount();
                            a3.openAccount();
                            accounts.add(a3);
                            break;
                        default:
                            System.out.println("Invalid choice for account type.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter Account Index: ");
                    int accountIndex = sc.nextInt();
                    if (accountIndex < 0 || accountIndex >= accounts.size()) {
                        System.out.println("Invalid account index.");
                        break;
                    }

                    Account selectedAccount = accounts.get(accountIndex);

                    System.out.println("What Transaction Do you want to do ?");
                    System.out.println("1. Deposit Amount");
                    System.out.println("2. Withdraw Amount ");
                    System.out.print("Enter your choice: ");
                    int transType = sc.nextInt();

                    switch (transType) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            double depositAmount = sc.nextDouble();
                            selectedAccount.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawalAmount = sc.nextDouble();
                            selectedAccount.withdraw(withdrawalAmount);
                            break;
                        default:
                            System.out.println("Invalid choice for transaction type.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter Account Index: ");
                    int displayIndex = sc.nextInt();
                    if (displayIndex < 0 || displayIndex >= accounts.size()) {
                        System.out.println("Invalid account index.");
                        break;
                    }

                    Account displayAccount = accounts.get(displayIndex);

                    System.out.println("Displaying transaction for account at index " + displayIndex);
                    displayAccount.displayTransaction();
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
