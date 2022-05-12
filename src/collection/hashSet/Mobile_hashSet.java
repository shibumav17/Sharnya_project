package collection.hashSet;

import java.util.HashSet;

public class Mobile_hashSet {

    public HashSet<String> createMobileSet(){

        //HashSet <Datatype> objName = new HashSet<>();

        HashSet <String> MobileBrand= new HashSet<>();
        MobileBrand.add("Samsung");
        MobileBrand.add("Nokia");
        MobileBrand.add("Blackberry");
        MobileBrand.add("Iphone");
        MobileBrand.add("Nokia");

        return MobileBrand;

    }
    public HashSet <Integer> createRAMSet() {
        HashSet<Integer> RAM = new HashSet<>();
        RAM.add(16);
        RAM.add(64);
        RAM.add(128);
        RAM.add(128);

        return RAM;
    }

    public HashSet<Double> createPriceSet(){

        HashSet <Double> Price = new HashSet<>();

        Price.add(12000.233);
        Price.add(30000.678);
        Price.add(7800.90);
        Price.add(12000.233);
        Price.add(30000.678);

        return Price;

    }

    public static void main(String[] args) {
        Mobile_hashSet obj= new Mobile_hashSet();
        HashSet<String> MobileBrand =obj.createMobileSet();
        HashSet<Integer> RAM= obj.createRAMSet();
        HashSet<Double> Price = obj.createPriceSet();


//Mobile brand set size
        System.out.println("Size of the Mobile Brand Set : " +MobileBrand.size());
        for (String var : MobileBrand) {
            System.out.println("Showing Mobile Brand Set : " +var);
        }

//Ram set size
        System.out.println("Size of the RAM Set : " +RAM.size());
        for(Integer Size : RAM){
            System.out.println("RAM of the Mobile : " +Size);
        }

        //Price Set price
        System.out.println("Size of the Price Set : " +Price.size());
        for (Double Output : Price) {
            System.out.println("Price of The Mobile : " +Output);
        }
    }
}

