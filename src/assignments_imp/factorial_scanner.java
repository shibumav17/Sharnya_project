package assignments_imp;

import java.util.Scanner;

public class factorial_scanner {

    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int factorial=1;
        for( int i = n; i>0; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the number is : " +factorial);


    }
}
