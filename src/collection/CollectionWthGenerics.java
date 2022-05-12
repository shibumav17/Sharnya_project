package collection;

import java.util.ArrayList;

public class CollectionWthGenerics {
    //method : it will create an Collection.ArrayList of city

    public  void createCityList() {
        //Collection <Datatype> VarName = New Collection<>;

        ArrayList <String>  cityList = new ArrayList<>();
        cityList.add("Agra");
        cityList.add("Pune");
        cityList.add("Delhi");

        //Advanced for loop : for(Datatype VarName : array/collection ) {

        for(String var : cityList) {
            System.out.println("City List : " +var );
        }
    }
 public void createMarksList(){
        //Collection <Datatype> VarName= new Collection<>();

     ArrayList <Integer> MarksList=new ArrayList<>();

     MarksList.add(79);
     MarksList.add(78);
     MarksList.add(89);

     //Advanced for loop : for(Datatype VarName : array/collection ) {

     for (Integer var : MarksList) {
         System.out.println("Marks List  : " +var);
     }
 }

 public ArrayList<Double> createPriceList() {
     //Collection <Datatype> VarName=new Collection<>();

     ArrayList <Double> PriceList=new ArrayList<>();

     PriceList.add(200.34);
     PriceList.add(90.37);
     PriceList.add(200.34);

     return PriceList;
 }
    public static void main(String[] args) {
        //step 1= create object

        CollectionWthGenerics obj = new CollectionWthGenerics();

    //step 2= obj.methodName();

        obj.createCityList();
        obj.createMarksList();
        obj.createPriceList();

        ArrayList <Double> resultList=obj.createPriceList();
        for(Double var : resultList){
            System.out.println("Main Method : Result : " +var);
        }

    }
}


