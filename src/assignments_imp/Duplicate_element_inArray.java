package assignments_imp;

public class Duplicate_element_inArray {
    public static void main(String[] args) {
        String[] arr = {"Agra", "Delhi", "Bangalore", "Pune", "Agra", "Pune"};

        boolean flag = false;
        for (int i = 0; i < arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("The duplicate element is : " +arr[i]);
                    flag=true;
                }
            }
        }

        if (flag==false)
        {
            System.out.println("No duplicate element found");
        }
    }
}
