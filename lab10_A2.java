public class lab10A2 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0); // Trying to divide by zero
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Catching any exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method that may throw an exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
