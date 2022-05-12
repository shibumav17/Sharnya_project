package demo_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of a: ");
        int a=scanner.nextInt();

        System.out.println("Please enter the value of b: ");
        int b= scanner.nextInt();

        System.out.println("Please enter your choice");
        Scanner scanner1 = new Scanner(System.in);
        String choice=scanner1.nextLine();

        if (choice=="ADD" || choice.equals("ADD")) {
            System.out.println("The addition of a & b is:" + (a + b));
        }
        else if (choice=="SUB" || choice.equals("SUB")) {
            System.out.println("The subtraction of a & b is : " + (a - b));
        }

        else if (choice=="Multiply" || choice.equals("Multiply")) {
            System.out.println("The Multiplication of a & b is : " + (a * b));
        }

        else if (choice=="Divide" || choice.equals("Divide")) {
        System.out.println("The Division of a & b is : " +(a/b));
        }

    }
}
