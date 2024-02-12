import java.util.Scanner;

public class lab1 {
    public static void main(String[] args)
    {
        System.out.println("");
        int number, square;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = scan.nextInt();
        square = number * number;
        System.out.print("\n The Square of the Given Number " + number + " is = " + square );
        scan.close();
    }
}
