package class_and_object;

public class Student {

    String name;
    int age;
    String section;

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;

    }

    public static void main(String[] args) {

        Student obj1 = new Student ("Parth", 23, "CS");
        Student obj2 = new Student ("Ram", 24, "EC");
        Student obj3 = new Student ("Danny", 25, "ME");
        Student obj4 = new Student ("Mohan", 26, "IT");


        System.out.println("Name of the Student: " +obj2.name);
        System.out.println("Age of the Student: " +obj2.age);
        System.out.println("Section of the Student: " +obj2.section);


        System.out.println("Name of the Student: " +obj3.name);
        System.out.println("Age of the Student: " +obj3.age);
        System.out.println("Section of the Student: " +obj3.section);


        System.out.println("Name of the Student: " +obj4.name);
        System.out.println("Age of the Student: " +obj4.age);
        System.out.println("Section of the Student: " +obj4.section);


    }
}
