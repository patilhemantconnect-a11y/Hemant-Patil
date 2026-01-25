import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

 
    void assignValues(String accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[5];

   
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        accounts[0].assignValues("A101", "Hemant", 5000);
        accounts[1].assignValues("A102", "Om", 12000);
        accounts[2].assignValues("A103", "Amit", 8000);
        accounts[3].assignValues("A104", "Het", 15000);
        accounts[4].assignValues("A105", "Meet", 6000);

    
        System.out.println("All Bank Accounts:");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

    
        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (BankAccount acc : accounts) {
            if (acc.accountId.equals(searchId)) {
                System.out.println("Account Found:");
                acc.displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }
}
