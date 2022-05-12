package hashMap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class MapStudents {

    public static void main(String[] args) {

        //SYNTAX: HashMap <Datatype_key, Datatype_value> = new HashMap<>();

        HashMap<Integer, Student> studentHashMap= new HashMap<>();

        Student student1=new Student(1, "Rahul", "CS");
        Student student2=new Student(2, "Saran", "IT");
        Student student3=new Student(3, "Karan", "ME");

        studentHashMap.put(1, student1);
        studentHashMap.put(2, student2);
        studentHashMap.put(3, student3);

        for (Integer var : studentHashMap.keySet()) {
//for readable format :  .getName()
            System.out.println("Printing student map : " + studentHashMap.get(var).getName());

        }

        HashMap <String, ArrayList<Student>> stringArrayListHashMap= new HashMap<>();

        ArrayList <Student> kpitStudents = new ArrayList<>();

        //need data of student : student1, 2 , 3

        Student std1=new Student(1, "Arun", "CS");
        Student std2=new Student(2, "Aman", "IT");
        Student std3=new Student(3, "Ajay", "ME");

        kpitStudents.add(std1);
        kpitStudents.add(std2);
        kpitStudents.add(std3);

        ArrayList <Student> hindustanStudent= new ArrayList<>();

        Student stu1=new Student(1, "Daniel", "CS");
        Student stu2=new Student(2, "Ramesh", "IT");
        Student stu3=new Student(3, "Suresh", "ME");

        hindustanStudent.add(stu1);
        hindustanStudent.add(stu2);
        hindustanStudent.add(stu3);

        stringArrayListHashMap.put("KPIT", kpitStudents );
        stringArrayListHashMap.put("Hindustan", hindustanStudent);

        for (Student output : stringArrayListHashMap.get("KPIT")) {
            System.out.println("KPIT Student : " + output.getName());
        }

        for (Student var : stringArrayListHashMap.get("Hindustan")) {
            System.out.println("Hindustan Student : " + var.getName());
        }


    }

}
