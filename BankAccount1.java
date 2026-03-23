class BankAccount1 {

 
    int accountNumber;
    String accountHolderName;
    double balance;

  
    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account Opened for " + accountHolderName);
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }


    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount1 {

    double interestRate = 5; 


    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest Earned: " + interest);
    }
}


class FixedDepositAccount extends BankAccount1 {

    double rate = 7; 
    int time = 2;  


    void maturityAmount() {
        double maturity = balance + (balance * rate * time / 100);
        System.out.println("Maturity Amount: " + maturity);
    }
}


public class Main {
    public static void main(String[] args) {


        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Hemant", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

  
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "Ravi", 20000);
        fd.checkBalance();
        fd.maturityAmount();
    }
}