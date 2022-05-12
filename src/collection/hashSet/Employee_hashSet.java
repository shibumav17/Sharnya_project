package collection.hashSet;

import model.Employee;

import java.util.HashSet;

public class Employee_hashSet {


    public HashSet<String> createEmployeeSet() {
//HashSet <Datatype> VarName=new HashSet<>();

        HashSet<String> Name = new HashSet<>();

        Name.add("Sandeep");
        Name.add("Rahul");
        Name.add("Priyanka");
        Name.add("Rashi");
        Name.add("Rashi");

        return Name;

    }

    public HashSet<Integer> createEmployeeId() {

        HashSet<Integer> employee_id = new HashSet<>();

        employee_id.add(9087);
        employee_id.add(8765);
        employee_id.add(2345);
        employee_id.add(9087);

        return employee_id;

    }

    public HashSet<Double> createPointsSet() {

        HashSet<Double> Performance_points = new HashSet<>();

        Performance_points.add(7.8);
        Performance_points.add(5.6);
        Performance_points.add(8.0);
        Performance_points.add(6.5);
        Performance_points.add(8.0);

        return Performance_points;
    }

    public static void main(String[] args) {

        Employee_hashSet obj= new Employee_hashSet();

        //Name
        HashSet <String> Name = obj.createEmployeeSet();
        System.out.println("Printing size of name set : " +Name.size());

        for (String output : Name){
            System.out.println("Name of the Employee : " +output);
        }

        //Employee_id

        HashSet <Integer> employee_id= obj.createEmployeeId();
        System.out.println("Size of the employee id set : " +employee_id.size());

        for (Integer Value : employee_id) {
            System.out.println("Employee Id : " +Value);
        }

        //Performance Points

        HashSet <Double> Performance_points= obj.createPointsSet();
        System.out.println("Size of the points set : " +Performance_points.size());

        for(Double Var : Performance_points){
            System.out.println("Performance points out of 10 : " +Var);
        }
    }
}