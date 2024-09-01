import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Print the sum of digits
        System.out.println("Sum of digits: " + sum);
    }
}
    
