package demo_Scanner;

import java.util.Scanner;

public class Circle_area {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = radius*radius*pi;
        double circumference = 2*pi*radius;
        System.out.println("Area of the circle is : " +area);
        System.out.println("Circumference of the circle is : " +circumference);
    }


}
