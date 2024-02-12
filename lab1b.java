import java.util.Scanner;

public class lab1b {
    
    public static void main(String[] args)
    {
        System.out.println("");
        String word, doubles;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Please Enter any Word : ");
        word = scan.nextLine();
        doubles = word + " " + word;
        System.out.print("\n The given word doubled is " + doubles );

        scan.close();
    }
    
}
