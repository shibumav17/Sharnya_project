package model;

public class Student {

    int rollno;
    String name;
    String branch;

    //parameterized constructor

    public Student(int rollno, String name, String branch) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
    }

    //getter and setter


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
