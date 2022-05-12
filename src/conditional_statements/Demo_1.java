package conditional_statements;

public class Demo_1 {

    public static void main(String[] args) {

        int age = 19;
        String Place = "Agra";
        if (age > 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }

        if (Place == "Bangalore") {
            System.out.println("You are in Bangalore");
        } else {
            System.out.println("You are not in Bangalore");
        }

        double rate = 900.234;
        if (rate > 1000.13)
        {
            System.out.println("Product is expensive");
        }
        else
        {
            System.out.println("Product is not expensive");

        }

        if (age > 18 & Place == "Agra")
        {
            System.out.println("You are eligible for voting in Agra");
        }
        else
        {
            System.out.println("You are not eligible for voting in Agra");
        }

        if (age > 18 & Place == "Bangalore")
        {
            System.out.println("You are not eligible for voting in Agra");
        } else {
            System.out.println("You are eligible for voting in Agra");
        }

        if (age>18 || Place=="Surat")
        {
            System.out.println("You are eligible for voting in Agra");
        }
        else
        {
            System.out.println("You are not eligible for voting in Agra");
        }

        if ( age>18 & Place=="Agra")
        {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        if ( !(age>18) )
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("You are not eligible for voting");
        }

        if (age>=18)
        {
         System.out.println("You are eligible for voting");

        }
        else
        {
            System.out.println("You are not eligible for voting");
        }
    }
}
