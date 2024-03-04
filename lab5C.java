package week5;

import java.util.Scanner;

class salaries {
    // field and method of the parent class
    float basic_sal = 40000;
    float housing_all = 20000;
    float transport_all = 7000;
}

// inherit from Employee1
class programmer extends salaries {
    float bonus = 12000;
    float overtime = 9100;
    float prog_total_sal;
}

public class lab5C {
    public static void main(String args[]) {
        String first_name1, last_name1;

        Scanner firstname = new Scanner(System.in);
        Scanner lastname = new Scanner(System.in);

        System.out.println("EMPLOYEE #1: ");

        System.out.println("Enter a First Name: ");
        first_name1 = firstname.nextLine();
        

        System.out.println("Enter a Last Name: ");
        last_name1 = lastname.nextLine();
       

        //new object
        programmer prog = new programmer();
        prog.prog_total_sal = prog.basic_sal + prog.housing_all + prog.transport_all + prog.bonus + prog.overtime;

        System.out.println("Programmer's Firstname and LastName are: " + first_name1 + " " + last_name1);
        System.out.println("Programmer's Basic salary is: " + prog.basic_sal);
        System.out.println("Programmers Housing Allowance is: " + prog.housing_all);
        System.out.println("Programmers Transport Allowance is: " + prog.transport_all);
        System.out.println("Bonus of Programmer is: " + prog.bonus);
        System.out.println("overtime of Programmer is: " + prog.overtime);
        System.out.println("TOTAL SALARY OF PROGRAMMER IS: " + prog.prog_total_sal);
        System.out.println("");

        firstname.close();
        lastname.close();
    }
    
}
