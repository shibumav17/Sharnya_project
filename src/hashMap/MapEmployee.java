package hashMap;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MapEmployee {

    public static void main(String[] args) {
        //SYNTAX: HashMap <Datatype_key, Datatype_value> = new HashMap<>();

        HashMap <Integer, Employee> employeeHashMap= new HashMap<>();


        Employee employee1= new Employee("Vikas", 2345, "Finance");
        Employee employee2= new Employee("Sanjay", 6789, "Management");
        Employee employee3= new Employee("Paul", 9087, "Technical");
        Employee employee4= new Employee("Arun", 7865,"Sales");

        employeeHashMap.put(1, employee1);
        employeeHashMap.put(2,employee2);
        employeeHashMap.put(3, employee3);
        employeeHashMap.put(4, employee4);

        for (Integer var : employeeHashMap.keySet()){
            System.out.println("Employee Name : " +employeeHashMap.get(var).getName());
            System.out.println("Employee id " +employeeHashMap.get(var).getEmployee_id());
            System.out.println("Employee dept. " +employeeHashMap.get(var).getDept());

        }
    }
}
