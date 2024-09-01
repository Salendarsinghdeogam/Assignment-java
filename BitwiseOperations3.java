public class BitwiseOperations3 {
    public static void main(String[] args) {
        // Example values for the inputs
        int bit1 = 1;
        int bit2 = 0;

        // a) Half Adder Circuit
        int halfAdderSum = bit1 ^ bit2;
        int halfAdderCarry = bit1 & bit2;

        System.out.println("Half Adder:");
        System.out.println("Sum: " + halfAdderSum);
        System.out.println("Carry: " + halfAdderCarry);

        // b) Full Adder Circuit
        // Assuming carryIn is 0
        int carryIn = 0;

        int fullAdderSum = (bit1 ^ bit2) ^ carryIn;
        int fullAdderCarry = (bit1 & bit2) | (carryIn & (bit1 ^ bit2));

        System.out.println("\nFull Adder:");
        System.out.println("Sum: " + fullAdderSum);
        System.out.println("Carry: " + fullAdderCarry);
    }
}
    

