package importantConcepts;

//Q1:can we override static method? :
//overriding is runtime polymorphism & it depends on object creation,in static we do not create any object

//Q2: can we use non-static data inside static method?
//No, we can not use non-static data in static method because non-static data is always part of object
//and to call static method we never create object



public class DemoStatic {

    public static String name; //static data

    public String city; //non-static data because 'static' is not mentioned here
                         //non-static : it will be available after object creation

    public static void m1(){

        System.out.println("Static variable :" +name);
        //System.out.println("Non-Static variabe: " +city); not allowed

        System.out.println("This is static method");
    }

    public static void main(String[] args) {

        //SYNTAX : ClassName.MethodName();

        DemoStatic.m1();

        System.out.println("Printing static variable : "+DemoStatic.name);
    }
}
