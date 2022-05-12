package collection.arrayList;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList(){

        //Collection datatype<> varname new Collection<>();

        ArrayList <Employee> EmployeeArrayList= new ArrayList<>();

        //Employee data

        Employee employee1= new Employee("Vikas", 2345, "Finance");
        Employee employee2= new Employee("Sanjay", 6789, "Management");
        Employee employee3= new Employee("Paul", 9087, "Technical");
        Employee employee4= new Employee("Arun", 7865,"Sales");

        EmployeeArrayList.add(employee1);
        EmployeeArrayList.add(employee2);
        EmployeeArrayList.add(employee3);
        EmployeeArrayList.add(employee4);

        return EmployeeArrayList;
    }

    public static void main(String[] args) {
        EmployeeArrayList obj = new EmployeeArrayList();

        ArrayList <Employee> EmployeeArraylist = obj.createEmployeeList();

        for (Employee var: EmployeeArraylist) {

            System.out.println("Name of the Employee : "+var.getName());
            System.out.println("Employee ID : " +var.getEmployee_id());
            System.out.println("Department of the Employee : " +var.getDept());

    }

        //Setter method

        for (Employee var : EmployeeArraylist){
            if (var.getName().equals("Vikas")){
            var.setName("Aman");  //setting name
        }

            System.out.println("Name : " +var.getName()+" "+"; ID : " +var.getEmployee_id()+" "+"; Dept : "+var.getDept());

}
    }

}
