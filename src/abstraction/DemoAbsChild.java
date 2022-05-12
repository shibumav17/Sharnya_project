package abstraction;

public class DemoAbsChild extends DemoAbstraction{


    @Override
    public void m1() {
        System.out.println("This is an overridden method");
    }

    public static void main(String[] args) {

        DemoAbsChild obj = new DemoAbsChild();
        obj.m1();
    }
}
