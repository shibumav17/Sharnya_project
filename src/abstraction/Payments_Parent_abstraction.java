package abstraction;

public class Payments_Parent_abstraction extends Payments_Parent {


    @Override
    public void Paytm() {
        System.out.println("This is the Child class of payments class of paytm");

    }

    @Override
    public void gpay() {
        System.out.println("This is the child Class of payments class's gpay method");

    }

    @Override
    public void phonepay() {
        System.out.println("This is the phonepay method of Payments");

    }

    public static void main(String[] args) {
        Payments_Parent_abstraction obj = new Payments_Parent_abstraction();
        obj.Paytm();
        obj.gpay();
        obj.phonepay();
    }
}
