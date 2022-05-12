package methods;

import java.util.Scanner;

public class CalcScanner {
     /* TODO  Syntax : access_specifier return_type method_name (parameter) {CODE}
          //access_specifier -> public, private, protected, default  THEORY PART
          //return_type -> output of functions or method : void : no return type
          //method_name -> can be anything: it should be meaningful
              //parameter -> input parameter : optional */

    //add, sub, multiply, divide

    //Syntax
    public void addition() {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the value of a : ");
        int a=scanner.nextInt();
        System.out.println("Please enter the value of b: ");
        int b=scanner.nextInt();
        int sum=a+b;

        System.out.println("Addition is : " +sum);
    }

    //subtraction
    public void subtraction(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("Please enter the value of b: ");
        int b= scanner.nextInt();
        int sub=a-b;
        System.out.println("Subtraction is :" +sub);
    }

    public static void main(String[] args) {

        //1 create object

        CalcScanner obj = new CalcScanner();
        Scanner scanner=new Scanner(System.in);

        String flag="Y";

        while (flag.equals("Y") || flag=="Y") {


            //2 obj.methodName();
            System.out.println("Please enter your choice: 1 for add, 2 for sub, 3 for multiply, 4 for divide");
            int choice = scanner.nextInt();
            if (choice == 1) {
                obj.addition();
            } else if (choice == 2) {
                obj.subtraction();


            }
            Scanner loopscanner=new Scanner(System.in);
            System.out.println("Please enter N to Exit or Y to continue");
            flag= loopscanner.nextLine();

        }}}

