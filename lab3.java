import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create the array
        String[] wordArray = new String[size];

        // Ask the user to input words into the array
        System.out.println("Enter words to add to the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            wordArray[i] = scanner.nextLine();
        }

        // Print out the contents of the array
        System.out.println("\nThe words you entered are:");
        for (String word : wordArray) {
            System.out.println(word);
        }

        // Close the scanner
        scanner.close();
    }
}

