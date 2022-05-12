package model;

public class Employee {

    String name;
    int Employee_id;
    String Dept;

    //parameterized constructor

    public Employee(String name, int employee_id, String dept) {
        this.name = name;
        Employee_id = employee_id;
        Dept = dept;
    }

    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
