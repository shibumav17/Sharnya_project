package polymorphism;

public class MethodOverloading {

    //Syntax method: access_specifier return_type method_name (parameter) {code/ body}

    //Method Overloading : same method with different input parameter

    public void helloStudent(){

        System.out.println("Hello Student, Welcome to Method Overloading");
    }

    //method overloading

    public void helloStudent(String name){

        System.out.println("Hello Student, Welcome to Method Overloading : " +name);
    }

    public void helloStudent(String name, int age) {

        System.out.println("Hello Student, Welcome to Method Overloading ; "+"Name :"+" "+name+" "+"; Age :"+age);
    }

    public static void main(String[] args) {
         MethodOverloading obj = new MethodOverloading();
         obj.helloStudent();
         obj.helloStudent("Mohit");
         obj.helloStudent("Mona", 26);
    }
}
