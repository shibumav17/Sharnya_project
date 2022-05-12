package demo_Scanner;


import java.util.Scanner;

public class Scanner_demo {

    public static void main(String[] args) {
        //Object of Scanner Class
        Scanner scanner = new Scanner(System.in);

        //String
        System.out.println("Please enter your name");

        String name= scanner.nextLine(); //reads String Value

        System.out.println("We have entered " +name);

        //int Data
        System.out.println("Please enter your age");
        int age= scanner.nextInt();// reads int output
        System.out.println("We have entered the age as : " +age) ;

        //Reading decimal

        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble(); //reads decimal values
        System.out.println("We have entered the salary as : " +salary);


    }
}
