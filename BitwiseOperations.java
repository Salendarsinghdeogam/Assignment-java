//4vi. find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit number?
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Extract the 2nd and 4th digits
        int secondDigit = (number / 100) % 10;
        int fourthDigit = number % 10;

        // Perform bitwise operations
        int andResult = secondDigit & fourthDigit;
        int orResult = secondDigit | fourthDigit;
        int xorResult = secondDigit ^ fourthDigit;

        // Print the results
        System.out.println("Bitwise AND: " + andResult);
        System.out.println("Bitwise OR: " + orResult);
        System.out.println("Bitwise XOR: " + xorResult);
    }
}
    

