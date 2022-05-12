package arrays;

public class Demo_arrays {
    public static void main(String[] args) {

        //Datatype [] var_name = {Element 1, 2 , 3, 4....};

        int [] marks = {34,45,76, 87, 93, 90};

        //index based data structure 0, 1, 2, 3 var_[index]

        System.out.println("Print array with index:" +marks[0]);
        System.out.println("Print array with index:" +marks[1]);
        System.out.println("Print array with index:" +marks[2]);
        System.out.println("Print array with index:" +marks[3]);
        System.out.println("Print array with index:" +marks[4]);
        System.out.println("Print array with index:" +marks[5]);


        for (int i=0; i< marks.length; i++) {
            System.out.println("Loop: Printing array with index: "+marks[i]);
        }

        //Advanced for loop: for (Datatype var_name: array) {
        // }

        for (int variable : marks) {
            System.out.println("Advanced for loop : "+variable);
        }

        String [] City = {"Agra" , "Delhi", "Bangalore", "Mumbai", "Pune" };

        System.out.println("First city:" +City[0]);
        System.out.println("Second city:" +City[1]);
        System.out.println("Third city:" +City[2]);
        System.out.println("Fourth city:" +City[3]);
        System.out.println("Fifth city:" +City[4]);


        for (int i=0; i<City.length; i++) {
                System.out.println("Loop: Print city with index:" + City[i]);

        }
        for (String var : City) {
            System.out.println("Advance for loop: " +var);
        }

        double [] interest ={7.2, 8.4, 6.7, 8.9, 9.2};
        System.out.println("Print Interest rate:" +interest[0]);
        System.out.println("Print Interest rate:" +interest[1]);
        System.out.println("Print Interest rate:" +interest[2]);
        System.out.println("Print Interest rate:"+interest[3]);
        System.out.println("Print Interest rate:" +interest[4]);

        for (int i = 0; i<interest.length; i++) {
            System.out.println("Loop: Print interest rate with index:" + interest[i]);

            }
        {

            for (double var : interest) {
                System.out.println("Advance for loop:" +var);
            }
        }

    }

}
