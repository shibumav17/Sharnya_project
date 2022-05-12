package class_and_object;

public class Dog {

    //Data members
    String breed;
    int age;

    //run, bark, eat, walk
    // Syntax : access_specifier return_type method_name (parameter) {CODE}

    //Methods
    public void runMethod() {
        System.out.println("This is run method of Dog class");
    }
    public void barkMethod(){
        System.out.println("This is Bark Method pof Dog class");
    }
    public void eatMethod(){
        System.out.println("This is eat method of dog class");
    }
    public void walkMethod(){
        System.out.println("This is walk method of dog class");
    }

    /* TODO  Syntax : access_specifier return_type method_name (parameter) {CODE}
        //access_specifier -> public, private, protected, default  THEORY PART
          //return_type -> output of functions or method : void : no return type
          //method_name -> can be anything: it should be meaningful
              //parameter -> input parameter : optional */

    public static void main(String[] args) {

        //METHOD CALLING-> CREATE OBJECT, OBJ.METHOD

        Dog obj= new Dog(); // 1 created object
        obj.runMethod(); //2- objectName.Method();
        obj.barkMethod(); //calling bark Method
        obj.eatMethod(); //calling eat Method
        obj.walkMethod(); // calling walk Method
    }





}
