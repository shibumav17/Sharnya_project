package collection;

import java.util.ArrayList;

public class CollectionWithGenerics_Assign {

    //Method: Create an Collection.ArrayList of Mobile Brands

    public void CreateMobileBrandList() {
        //Collection <Datatype> VarName = New Collection<>()


        ArrayList  <String> MobileBrand = new ArrayList<>();
        MobileBrand.add("Iphone");
        MobileBrand.add("Samsung");
        MobileBrand.add("Nokia");
        MobileBrand.add("Google Pixel");
        MobileBrand.add("Motorola");

        //Advanced for loop : for(Datatype VarName : Array/Collection

        for (String var : MobileBrand) {
            System.out.println("Printing Mobile Brands : " + var);
        }
    }

    public void CreateDistanceList(){

        ArrayList <Integer> Distance = new ArrayList<>();
        Distance.add(250);
        Distance.add(67);
        Distance.add(78);
        Distance.add(300);

        for (Integer var : Distance) {
            System.out.println("Printing Distance in kms : " +var);
        }
    }

    public ArrayList <Double> CreateSalaryList() {

        ArrayList<Double> Salary = new ArrayList<>();
        Salary.add(2000.23);
        Salary.add(7000.98);
        Salary.add(5000.50);

        return Salary;

    }

    public static void main(String[] args) {
        //create object: ClassName obj = new ClassName()

        CollectionWithGenerics_Assign obj = new CollectionWithGenerics_Assign();

        //Method name: obj.ClassName()

        obj.CreateMobileBrandList();
        obj.CreateDistanceList();
        obj.CreateSalaryList();

        ArrayList <Double> ResultList = obj.CreateSalaryList();
        for (Double var : ResultList){
        System.out.println("Main Method : Salary is : " +var);
    }
}
}




