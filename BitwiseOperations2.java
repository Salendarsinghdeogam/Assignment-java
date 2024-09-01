//4vii.Find left shit, right shift and zero fill of summation of all digits of any 4 digit number and it will be shifted by 3rd digit of any 4 digit number?

import java.util.Scanner;
public class BitwiseOperations2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        // Extract the 3rd digit for the shift amount
        int shiftAmount = (number / 100) % 10;

        // Perform left shift, right shift, and zero fill
        int leftShift = sum << shiftAmount;
        int rightShift = sum >> shiftAmount;
        int zeroFillShift = sum >>> shiftAmount;

        // Print the results
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
        System.out.println("Zero Fill Shift: " + zeroFillShift);
    }
}
    

