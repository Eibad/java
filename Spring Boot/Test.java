import java.util.Scanner;

public class InteractiveLoopDemo {

    // Method to print numbers from 1 to max
    public static void printNumbers(int max) {
        System.out.println("\nPrinting numbers from 1 to " + max + ":");
        for (int i = 1; i < max; i++) { // Mistake: should be i <= max
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to print only even numbers
    public static void printEvenNumbers(int max) {
        System.out.println("\nEven numbers up to " + max + ":");
        for (int i = 0; i <= max; i++) { // Starts from 0, might confuse
            if (i % 2 = 0) { // Mistake: should be i % 2 == 0
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method to sum numbers up to max
    public static int sumNumbers(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Interactive Loop Demo!");
        System.out.print("Enter a positive number: ");
        int maxNumber = scanner.nextInt();

        if (maxNumber < 0) { // Mistake: should be <= 0
            System.out.println("Please enter a number greater than 0.");
        } else {
            // Call different loop methods
            printNumbers(maxNumber);
            printEvenNumbers(maxNumber);

            int total = sumNumbers(maxNumber);
            System.out.println("\nSum of numbers from 1 to " + maxNumber + " is " + total); // Missing colon for consistency

            // Extra: loop with a break condition
            System.out.println("\nNumbers until a multiple of 7 is found:");
            for (int i = 1; i <= maxNumber; i++) {
                if (i % 7 == 0)
                    System.out.println("Multiple of 7 found: " + i + ", stopping loop.");
                    break; // Mistake: should be inside if-block
                System.out.print(i + " ");
            }

            System.out.println("\nThank you for using the program!");
        }

        scanner.close();
    }
}
