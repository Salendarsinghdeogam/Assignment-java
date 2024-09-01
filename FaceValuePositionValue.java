//4ii. find the face value and position value of any 4 digit number?


import java.util.Scanner;

public class FaceValuePositionValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Find the face value and position value of each digit
        int position = 1000;
        while (number != 0) {
            int digit = number % 10;
            System.out.println("Digit: " + digit);
            System.out.println("Face Value: " + digit);
            System.out.println("Position Value: " + (digit * position));
            position /= 10;
            number /= 10;
        }
    }
}
    

