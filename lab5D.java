package week5;

public class lab5D {
        public static void main(String[] args) {
            // Array of temperatures
            double[] temperatures = {25.5, 28.7, 23.1, 27.3, 26.8};
    
            // Calculate sum using a loop
            double sum = 0;
            for (double temp : temperatures) {
                sum += temp;
            }
    
            // Calculate average using the sum and the length of the array
            double average = sum / temperatures.length;
    
            // Print sum and average
            System.out.println("Sum of the temperatures: " + sum);
            System.out.println("Average temperature: " + average);
        }
    }
    
