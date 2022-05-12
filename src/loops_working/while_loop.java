package loops_working;

public class while_loop {

    public static void main(String[] args) {

        int i=0;
//While loop
        while (i<10)
        {
            System.out.println("Serial number :" +i);
            i++;
        }
 //Do while

        do {
            System.out.println("New Serial number: " +i );
            i--;
        }
             while(i>0);
     }
}
