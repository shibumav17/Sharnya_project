package collection.arrayList;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {
    public ArrayList <Student> createStudentList(){

        // Collection <Datatype> VarName= new Collection<>();

        ArrayList <Student> StudentArrayList = new ArrayList<>();

        //need data of student : student1, 2 , 3

        Student student1=new Student(1, "Rahul", "CS");
        Student student2=new Student(2, "Saran", "IT");
        Student student3=new Student(3, "Karan", "ME");

        StudentArrayList.add(student1);
        StudentArrayList.add(student2);
        StudentArrayList.add(student3);

        return StudentArrayList;

    }

    public static void main(String[] args) {

        StudentArrayList obj= new StudentArrayList();
        ArrayList <Student> StudentArrayList =obj.createStudentList();

        for(Student var: StudentArrayList) {
            System.out.println("Printing rollno : " +var.getRollno());

            System.out.println("Printing name : " +var.getName());

            System.out.println("Printing branch : " +var.getBranch());

            System.out.println("Printing rollno : " +var.getRollno()+ " "+"; Printing name : "+var.getName()+" "+"; Printing branch : " +var.getBranch());
        }

        //Setter Method

        for (Student var: StudentArrayList){
            if (var.getName().equals("Rahul")){
                var.setName("Aman");
            }

            var.setBranch("CS");

            System.out.println("Name : " +var.getName()+" "+"Roll no. : "+var.getRollno()+" "+"Changed Branch : "+var.getBranch());
        }
    }
}
