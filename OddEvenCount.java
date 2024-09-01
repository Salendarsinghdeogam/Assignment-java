//7. WAP to find total number of even and odd numbers avaialble in an array of user defined numbers of elements using command line arguments? Size of the array depends on the number of inputs.

public class OddEvenCount {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        int evenCount = 0;
        int oddCount = 0;

        // Convert command line arguments to integers and store in the array
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Count even and odd numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
    

