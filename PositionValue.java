//4iii. Find the value available at position required by user it may be 10,
//100 or 1000?

import java.util.Scanner;

public class PositionValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number and a position
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the position (10, 100, or 1000): ");
        int position = scanner.nextInt();

        // Find the value at the specified position
        int value = (number / position) % 10;

        // Print the value
        System.out.println("Value at position " + position + ": " + value);
    }
}
    
