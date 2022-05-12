package polymorphism;

import collection.Demo;

public class DemoB extends DemoA {

    public void m1(){

        System.out.println("Method m1 of Demo B");
    }

    public static void main(String[] args) {

        DemoB obj = new DemoB();
        obj.m1();

        DemoA obj1 = new DemoB();
        obj.m1();

       /* //child(B) can not hold object of parent(A)
        DemoB obj3= new DemoA(); //it will give compile time error
        obj.m1(); */
    }
}
