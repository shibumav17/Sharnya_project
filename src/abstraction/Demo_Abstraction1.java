package abstraction;

public abstract class Demo_Abstraction1 {
    //SYNTAX : access_specifier return_type method_name (parameter) {CODE / BODY}

    //abstract method : a method without method body
    //any class which is having at least an abstract method will be declared as abstract class.

    public abstract void m1();
    //can we create object of abstract class ? No : because there is no method implementation so if we
    // try to call the abstract method then JVM will not be able to find the CODE.

    //we can have normal method in abstract class because we need at least one abstract method

    public void m2() {

        System.out.println("This is the normal method in an abstract class");

    }
}
