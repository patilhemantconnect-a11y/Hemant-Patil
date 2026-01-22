import java.util.Scanner;

class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input amount
        System.out.print("Enter amount to be dispensed: ");
        int amount = sc.nextInt();

        // Denominations
        int[] notes = {100, 50, 10, 5, 2, 1};

        System.out.println("Currency notes:");

        // Calculate minimum notes
        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount = amount % note;
                System.out.println(note + " : " + count);
            }
        }
    }
}
