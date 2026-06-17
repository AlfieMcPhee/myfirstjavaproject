import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name ");
        String name = scanner.nextLine(); // Assigning variable
        System.out.println("Your name is " + name);

        System.out.print("Enter your age ");
        int age = scanner.nextInt(); // Integers
        System.out.println("You are " + age + " Years old");

        System.out.println("Enter your GPA");
        double gpa = scanner.nextDouble(); // Doubles
        System.out.println("Your GPA is " + gpa);


// test commit
        scanner.close(); // this is good practice at the end of a program
    }
}
