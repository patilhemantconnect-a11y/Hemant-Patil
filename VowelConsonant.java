import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for case-insensitive check
        ch = Character.toLowerCase(ch);

        // Check vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a Vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is a Consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}
