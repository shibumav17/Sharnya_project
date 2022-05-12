package importantConcepts;

public final class DemoFinal {


    public final void m1(){
        System.out.println("Thi is m1 method");
    }


    public static void main(String[] args) {

        final String Name="Mayank";
        System.out.println("Name before changing -" +Name);

       // Name="Rohit"; we can not change final variable
        System.out.println("Name after changing -" +Name);
    }
}
