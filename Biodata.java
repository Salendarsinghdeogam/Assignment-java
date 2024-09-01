//1. Write a java program to print your biodata?
import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for biodata details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // Consume the newline character after reading the integer
        scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        // Print the biodata in a formatted manner
        System.out.println("\nBiodata:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

