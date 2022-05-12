package methods;

public class CalcWithReturnType {

    public int addition() {

        int a = 6;
        int b = 9;

        int sum = a + b;
        return sum;
    }
    //sub, mul, divide

    public int subtraction() {

        int a = 100;
        int b = 50;
        int sub = a - b;
        return sub;
    }

    public int multiplication(){

        int a = 9;
        int b = 10;
        int mul= a*b;
        return mul;
    }

    public int division(){

        int a = 100;
        int b = 4;
        int div= a/b;
        return div;
    }

    public static void main(String[] args) {
        CalcWithReturnType obj = new CalcWithReturnType();

        int result=obj.addition();
        System.out.println("Addition is : " +result);

        int sub= obj.subtraction();
        System.out.println("Subtraction is : " +sub);

        int mul=obj.multiplication();
        System.out.println("Multiply is : " +mul);

        int div= obj.division();
        System.out.println("Division is : " + div);
    }
}
