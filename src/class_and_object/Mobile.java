package class_and_object;

public class Mobile {

    //DATA MEMBER
    //NAME
    String name = "Realme";
    //RAM
    int RAM =128;
    //camera
    double pixel = 13.2;
    //Battery
    int battery = 2200;

    public static void main(String[] args) {

        Mobile Set1 = new Mobile();
        System.out.println(Set1.name);
        System.out.println(Set1.RAM);
        System.out.println(Set1.pixel);
        System.out.println(Set1.battery);
    }




}
