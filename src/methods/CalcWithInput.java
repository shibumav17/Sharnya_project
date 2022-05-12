package methods;

public class CalcWithInput {

    public int add(int a, int b) {

        return a+b;
    }

    public static void main(String[] args) {

        CalcWithInput obj= new CalcWithInput();
        int result = obj.add(6,9);
        System.out.println("Addition of a & b is : " +result);

        result= obj.add(7,9);
        System.out.println("Second Addition is : " +result);
    }
}
