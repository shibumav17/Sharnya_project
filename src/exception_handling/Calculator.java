package exception_handling;

public class Calculator {

    public int divide(int a, int b){
          int result=0;

        try{

            result=a/b;
        }
            catch (Exception e){

                System.out.println("CATCH BLOCK : Exception occurred " +e);
                //catch block will execute only when exception occurs

               // System.exit(1);
            }
        finally {
            System.out.println("Finally Block :This will always execute...");
            //finally will always get executed, it will only not get executed when we use System.exit(1)
        }
            return result;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Before method call");

       int result=  obj.divide(10,0);

        System.out.println("After method call");

        System.out.println("Output is..." +result);
    }
}

