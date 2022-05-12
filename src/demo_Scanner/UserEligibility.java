package demo_Scanner;

import java.util.Scanner;

public class UserEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the voting app, Please enter your age");

        int age= scanner.nextInt();

        if (age>=18) {
            System.out.println("User is eligible for voting");
        }
        else{
            System.out.println("User is not eligible for voting");
        }

    }
}
