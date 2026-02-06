import java.util.Scanner;

public class BankAccount {

    private String accountId;
    private String accountHolderName;
    private double balance;

    public void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    public void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }

    public String getAccountId() {
        return accountId;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();

            System.out.println("Enter details for account " + (i + 1));
            System.out.print("Account ID: ");
            String id = sc.nextLine();

            System.out.print("Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); 

            accounts[i].assignValues(id, name, balance);
        }

        System.out.println("\n--- All Bank Accounts ---");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (BankAccount acc : accounts) {
            if (acc.getAccountId().equals(searchId)) {
                System.out.println("\nAccount Found:");
                acc.displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }

        sc.close();
    }
}
