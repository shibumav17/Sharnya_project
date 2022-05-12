package assignments_imp;

public class Swap_two_numbers {

    public static void main(String[] args) {

        System.out.println("Before swapping the numbers");
        int a = 10;
        int b = 12;
        System.out.println("Value of a : " +a);
        System.out.println("Value of b : " +b);

        System.out.println("After swapping the numbers");
        a= a+b; //10+12=22
        b= a-b; //22-12=10
        a= a-b; //22-10=12
        System.out.println("value of a : "+a);
        System.out.println("value of b :" +b);
    }
}
