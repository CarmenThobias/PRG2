import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            int number = Integer.parseInt(input);
            if (isPrime(number)) {
                System.out.println("Output: " + number + " is a prime number");
            } else {
                System.out.println("Output: " + number + " is not a prime number");
            }
        } else if (isFloat(input)) {
            double number = Double.parseDouble(input);
            System.out.println("Output: " + number + " is a float number");
        } else if (isString(input)) {
            System.out.println("Output: Not a number");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }

    // Method to check if a string represents an integer
    private static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }

    // Method to check if a string represents a float
    private static boolean isFloat(String str) {
        return str.matches("-?\\d*\\.\\d+");
    }

    // Method to check if a string represents a string (not a number)
    private static boolean isString(String str) {
        return !str.matches("-?\\d+(\\.\\d+)?");
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
