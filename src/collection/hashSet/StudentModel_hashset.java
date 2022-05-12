package collection.hashSet;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import model.StudentModel;

import java.util.HashSet;

public class StudentModel_hashset {

    public HashSet<StudentModel> createStudentset() {

        //Collection <Datatype> VarName = new Collection<>();


        HashSet<StudentModel> StudentHashSet = new HashSet<>();
        StudentModel student1 = new StudentModel(1, "Rakesh", "IT");
        StudentModel student2 = new StudentModel(1, "Raj", "CS");
        StudentModel student3 = new StudentModel(2, "Rahul", "IT");
        StudentModel student4 = new StudentModel(3, "Mukesh", "CS");

        System.out.println("Hash Code of student 1 - " + student1.hashCode());
        System.out.println("Hash Code of student 2 - " + student2.hashCode());

        StudentHashSet.add(student1);
        StudentHashSet.add(student2);
        StudentHashSet.add(student3);
        StudentHashSet.add(student4);

        return StudentHashSet;

    }

    public static void main(String[] args) {

        StudentModel_hashset obj = new StudentModel_hashset();
        HashSet<StudentModel> StudentHashSet = obj.createStudentset();

        System.out.println("Print student HashSet size : " +StudentHashSet.size());

        for (StudentModel var : StudentHashSet){

            System.out.println("Student rollno. : " +var.getRollno()+" "+"; Student Name : "+var.getName()+" "+"; Student Branch : "+var.getBranch());
        }

    }
}