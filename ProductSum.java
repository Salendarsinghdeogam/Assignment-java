//4iv. Sum of product of consecutive digits of any 4 digit number? Supoose
//num=1234 then output= 4*3+3*2+2*1

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Calculate the sum of products of consecutive digits
        int sum = 0;
        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        while (number != 0) {
            sum += digit1 * digit2;
            digit1 = digit2;
            number /= 10;
            digit2 = number % 10;
        }

        // Print the sum of products
        System.out.println("Sum of products of consecutive digits: " + sum);
    }
}
    
