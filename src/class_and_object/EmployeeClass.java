package class_and_object;

public class EmployeeClass {

    //PROPERTIES OR DATA MEMBER OR MEMBER FUNCTION

    String name="Shubham Kumar";
    String Department="Finance";
    int Employee_id= 12346;
    double salary = 10000.00;

    public static void main(String[] args) {
        EmployeeClass Employee = new EmployeeClass();

        System.out.println(Employee.name);
        System.out.println(Employee.Department);
        System.out.println(Employee.Employee_id);
        System.out.println(Employee.salary);

    }


}

