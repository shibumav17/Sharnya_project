package loops_working;

public class Break_loop {

    public static void main(String[] args) {

         for (int i=0; i<10; i++)

         {
             System.out.println("printing the value of i :"+i);

             if(i==6)
             {
                 System.out.println("Loop breaking at:" +i);
                 break;
             }
         }
        {
             int j=10;
             while (j>0)
             {
                 System.out.println("Value of j: " +j);
                 j--;
                 if (j==8) {
                     break;
                 }

             }


         }
    }
}

