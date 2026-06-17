import java.util.Scanner;



public class inputoutput {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = scanner.nextLine(); // Assigning variable
        System.out.println("Your name is " + name);



        scanner.close(); // this is good practice at the end of a program
    }
}
