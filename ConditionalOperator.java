
    import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Extract digits
        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        // a) Sum of all even digits
        int sumOfEvenDigits = (thousands % 2 == 0 ? thousands : 0) +
                             (hundreds % 2 == 0 ? hundreds : 0) +
                             (tens % 2 == 0 ? tens : 0) +
                             (ones % 2 == 0 ? ones : 0);

        // b) Sum of all odd digits
        int sumOfOddDigits = (thousands % 2 != 0 ? thousands : 0) +
                            (hundreds % 2 != 0 ? hundreds : 0) +
                            (tens % 2 != 0 ? tens : 0) +
                            (ones % 2 != 0 ? ones : 0);

        // c) Difference between average of even digits (excluding divisible by 4) and odd digits (excluding divisible by 3)
        int countEvenDigits = (thousands % 2 == 0 && thousands % 4 != 0 ? 1 : 0) +
                             (hundreds % 2 == 0 && hundreds % 4 != 0 ? 1 : 0) +
                             (tens % 2 == 0 && tens % 4 != 0 ? 1 : 0) +
                             (ones % 2 == 0 && ones % 4 != 0 ? 1 : 0);
        int countOddDigits = (thousands % 2 != 0 && thousands % 3 != 0 ? 1 : 0) +
                             (hundreds % 2 != 0 && hundreds % 3 != 0 ? 1 : 0) +
                             (tens % 2 != 0 && tens % 3 != 0 ? 1 : 0) +
                             (ones % 2 != 0 && ones % 3 != 0 ? 1 : 0);
        double averageEvenDigits = countEvenDigits == 0 ? 0 : (double)sumOfEvenDigits / countEvenDigits;
        double averageOddDigits = countOddDigits == 0 ? 0 : (double)sumOfOddDigits / countOddDigits;
        double difference = averageEvenDigits - averageOddDigits;

        // d) Sum of product of consecutive even digits
        int productOfEvenDigits = ((thousands % 2 == 0 && hundreds % 2 == 0) ? thousands * hundreds : 0) +
                                 ((hundreds % 2 == 0 && tens % 2 == 0) ? hundreds * tens : 0) +
                                 ((tens % 2 == 0 && ones % 2 == 0) ? tens * ones : 0);

        // e) Sum of product of consecutive odd digits
        int productOfOddDigits = ((thousands % 2 != 0 && hundreds % 2 != 0) ? thousands * hundreds : 0) +
                                ((hundreds % 2 != 0 && tens % 2 != 0) ? hundreds * tens : 0) +
                                ((tens % 2 != 0 && ones % 2 != 0) ? tens * ones : 0);

        // f) Difference between Sum of product of consecutive even digits (excluding 2 and 6) and odd digits (excluding 3 and 7)
        int productOfEvenDigitsExcluding26 = ((thousands % 2 == 0 && hundreds % 2 == 0 && thousands != 2 && hundreds != 6) ? thousands * hundreds : 0) +
                                            ((hundreds % 2 == 0 && tens % 2 == 0 && hundreds != 2 && tens != 6) ? hundreds * tens : 0) +
                                            ((tens % 2 == 0 && ones % 2 == 0 && tens != 2 && ones != 6) ? tens * ones : 0);
        int productOfOddDigitsExcluding37 = ((thousands % 2 != 0 && hundreds % 2 != 0 && thousands != 3 && hundreds != 7) ? thousands * hundreds : 0) +
                                          ((hundreds % 2 != 0 && tens % 2 != 0 && hundreds != 3 && tens != 7) ? hundreds * tens : 0) +
                                          ((tens % 2 != 0 && ones % 2 != 0 && tens != 3 && ones != 7) ? tens * ones : 0);
        int differenceOfProducts = productOfEvenDigitsExcluding26 - productOfOddDigitsExcluding37;

        // g) Sum of product of corresponding even digits of first number and corresponding odd digits of second number
        System.out.print("Enter the second 4-digit number: ");
        int number2 = scanner.nextInt();

        int thousands2 = number2 / 1000;
        int hundreds2 = (number2 / 100) % 10;
        int tens2 = (number2 / 10) % 10;
        int ones2 = number2 % 10;

        int productOfCorrespondingDigits = (thousands % 2 == 0 && thousands2 % 2 != 0 ? thousands * thousands2 : 0) +
                                          (hundreds % 2 == 0 && hundreds2 % 2 != 0 ? hundreds * hundreds2 : 0) +
                                          (tens % 2 == 0 && tens2 % 2 != 0 ? tens * tens2 : 0) +
                                          (ones % 2 == 0 && ones2 % 2 != 0 ? ones * ones2 : 0);

        // Print the results
        System.out.println("a) Sum of all even digits: " + sumOfEvenDigits);
        System.out.println("b) Sum of all odd digits: " + sumOfOddDigits);
        System.out.println("c) Difference between average of even digits (excluding divisible by 4) and odd digits (excluding divisible by 3): " + difference);
        System.out.println("d) Sum of product of consecutive even digits: " + productOfEvenDigits);
        System.out.println("e) Sum of product of consecutive odd digits: " + productOfOddDigits);
        System.out.println("f) Difference between Sum of product of consecutive even digits (excluding 2 and 6) and odd digits (excluding 3 and 7): " + differenceOfProducts);
        System.out.println("g) Sum of product of corresponding even digits of first number and corresponding odd digits of second number: " + productOfCorrespondingDigits);
    }
}
    

