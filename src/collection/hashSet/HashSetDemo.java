package collection.hashSet;

import java.util.HashSet;

public class HashSetDemo {

    public HashSet <String> createHashSet() {

        //HashSet <Datatype> objName= new HashSet<>();
//String
        HashSet <String> program = new HashSet<>();
        program.add("Java");
        program.add("Spring");
        program.add("Spring boot");
        program.add("Java");
        program.add("Spring");
        program.add("Spring boot");

        System.out.println("Size of programs set: " +program.size());

        return program;
    }

    //Integer
    public HashSet <Integer> createIntegerSet(){

        HashSet <Integer> Marks= new HashSet<>();
        Marks.add(45);
        Marks.add(90);
        Marks.add(78);
        Marks.add(90);
        Marks.add(80);

        System.out.println("Printing size of marks set : " +Marks.size());

        return Marks;
    }
    //Double

    public HashSet <Double> createDoubleSet(){

        HashSet <Double> Percentage=new HashSet<>();
        Percentage.add(89.76);
        Percentage.add(34.54);
        Percentage.add(76.98);
        Percentage.add(46.90);
        Percentage.add(12.0987);
        Percentage.add(89.76);

        System.out.println("Size of the Percentage set : " +Percentage.size());

        return  Percentage;
    }

    public static void main(String[] args) {
        //method calling: className obj=new ClassName();
        HashSetDemo obj= new HashSetDemo();
        HashSet <String> programs= obj.createHashSet();
        HashSet <Integer> Marks= obj.createIntegerSet();
        HashSet <Double> Percentage=obj.createDoubleSet();

        for (String var : programs){

            System.out.println("Programs offered : " +var);
        }

        for (Integer output : Marks ){
            System.out.println("Marks of the candidate : " +output);
        }

        for (Double Value : Percentage) {

            System.out.println("Performance Percentage of the candidate : " +Value);
        }
    }

}