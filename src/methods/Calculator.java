package methods;

public class Calculator {

    /* TODO  Syntax : access_specifier return_type method_name (parameter) {CODE}
        //access_specifier -> public, private, protected, default  THEORY PART
          //return_type -> output of functions or method : void : no return type
          //method_name -> can be anything: it should be meaningful
              //parameter -> input parameter : optional */

    //add, sub, multiply, divide

    //Syntax
    public void addition() {
        int a=7;
        int b=2;
        int sum=a+b;
        System.out.println("Addition is : " +sum);
    }

//subtraction
    public void subtraction(){

        int a= 10;
        int b= 9;
        int sub=a-b;
        System.out.println("Subtraction is :" +sub);
    }
//multiply
    public void multiply() {
        int a=6;
        int b=4;
        int mul=a*b;

        System.out.println("Multiplication is : " +mul);
    }
    //Divide

    public void divide()  {
        int a = 50;
        int b = 5;
        int div = a/b;
        System.out.println("Division is : " +div);
    }
    public static void main(String[] args) {

        //1 create object

        Calculator obj=new Calculator();

        //obj.methodName();

        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.divide();


    }




    }

