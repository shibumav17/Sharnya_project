package model;

import java.util.Objects;

public class StudentModel {

    int rollno;
    String name;
    String branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentModel that = (StudentModel) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

//parameterized constructor

    public StudentModel(int rollno, String name, String branch) {
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
