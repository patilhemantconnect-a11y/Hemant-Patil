class BankAccount {

    // Instance variables
    String account_holder_name;
    double balance;

    // Static variable (same for all accounts)
    static double interest_rate;

    // Constructor
    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    
    double calculateInterest() {
        return balance * interest_rate / 100;
    }

   
    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println();
    }

   
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest Rate Updated to: " + interest_rate + "%\n");
    }

    public static void main(String[] args) {

        BankAccount.updateInterestRate(5);


        BankAccount a1 = new BankAccount("Hemant", 10000);
        BankAccount a2 = new BankAccount("Ravi", 20000);

        a1.displayInterest();
        a2.displayInterest();

        BankAccount.updateInterestRate(7);

              a1.displayInterest();
        a2.displayInterest();
    }
}