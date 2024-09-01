//4v. find sum of product of corresponding digits of two any 4 digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1
import java.util.Scanner;

public class ProductSum2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for two 4-digit numbers
        System.out.print("Enter the first 4-digit number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second 4-digit number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of products of corresponding digits
        int sum = 0;
        while (num1 != 0 && num2 != 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            sum += digit1 * digit2;
            num1 /= 10;
            num2 /= 10;
        }

        // Print the sum of products
        System.out.println("Sum of products of corresponding digits: " + sum);
    }
}

