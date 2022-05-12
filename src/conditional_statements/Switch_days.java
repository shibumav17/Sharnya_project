package conditional_statements;

public class Switch_days {
    //Switch Statements Assignment

    public static void main(String[] args) {
        int day=5;
        switch(day) {
            case 1:
            System.out.println("Day is Monday");
            break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
        }

        int age= 10;
        switch (age) {

            case 10:
                System.out.println("Person is Child");
                break;
            case 15:
                System.out.println("Person is teenage");
                break;
            case 21:
                System.out.println("Person is Adult");
                break;
            case 40:
                System.out.println("Person is middle age");
                break;
            case 65:
                System.out.println("Person is senior citizen");
                break;
            default:
                System.out.println("Invalid input, please enter the correct age");


        }
    }
}
