package assignments_imp;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {

        //0 1 1 2 3 5 8 13 21 34 ...

        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);

        int term = sc.nextInt();
        int a=0;
        int b=1;
        int c;


        for (int i=1; i<=term; i++) {
            System.out.println(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
