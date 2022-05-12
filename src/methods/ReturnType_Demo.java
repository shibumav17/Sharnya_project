package methods;

public class ReturnType_Demo {

    public String message() {

        String msg="Welcome to Return Type, name is : ";
        return msg;
    }

    public int getAge() {

        int age=26;
        return age;
    }

    public double getSalary(){

        double salary=346.98;
        return salary;
    }

    public static void main(String[] args) {

        ReturnType_Demo obj = new ReturnType_Demo();
        String output=obj.message(); //store the o/p
        System.out.println(output + "Aman");

        int age=obj.getAge();
        System.out.println("Age is : " +age);

        double salary=obj.getSalary();
        System.out.println("Salary is : " +salary);

    }
}
