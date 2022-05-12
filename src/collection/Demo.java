package collection;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        //Collection way: CollectionName VarName= new CollectionName();

        ArrayList courseList = new ArrayList();
        courseList.add("Java");  // 0 index
        courseList.add("Core Java"); // 1 index
        courseList.add("Advanced Java"); //2 index
        courseList.add("Java script"); //3 index
        courseList.add("Spring"); // 4 index
        courseList.add("Python"); // 5 index

        System.out.println("Printing 3 index element : " + courseList.get(3));
        System.out.println("Printing 0 index element : " + courseList.get(0));
        System.out.println("Printing 1 index element : " + courseList.get(1));
        System.out.println("Printing 2 index element : " + courseList.get(2));
        System.out.println("Printing 4 index element : " + courseList.get(4));
        System.out.println("Printing 5 index element : " + courseList.get(5));

        for (int i = 0; i<courseList.size(); i++) {
            System.out.println("Printing list using loop at " +i + " Index : "  + courseList.get(i));
        }

            //Advanced for loop : for (Datatype var_name : array/collection) {

            for (Object var : courseList) {

                System.out.println("Printing using advanced loop : " +var);
            }

            //removing Data from array list

            System.out.println("Before removing : " +courseList.get(1));
            courseList.remove(1);
            System.out.println("After removing : " +courseList.get(1));

        for (int i = 0; i<courseList.size(); i++) {
            System.out.println("Printing list using loop at " +i + " Index : "  + courseList.get(i));




            }

    }
}
