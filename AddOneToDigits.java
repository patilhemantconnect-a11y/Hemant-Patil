import java.util.Scanner;

class AddOneToDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;


        while (num > 0) {
            int digit = num % 10;   // get last digit
            digit = (digit + 1) % 10; // add 1, convert 9 to 0
            result = digit * place + result;

            place = place * 10;
            num = num / 10;
        }

        System.out.println("New number: " + result);
    }
}
