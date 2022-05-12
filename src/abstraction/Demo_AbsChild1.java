package abstraction;

public class Demo_AbsChild1 extends Demo_Abstraction1 {


    @Override
    public void m1() {
        System.out.println("This is the m1 method of demo abstraction1 class");

    }

    public static void main(String[] args) {


        Demo_AbsChild1 obj = new Demo_AbsChild1();
        obj.m1();
        obj.m2();
    }
}