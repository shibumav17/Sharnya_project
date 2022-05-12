package hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class hashmap_demo {

    public static void main(String[] args) {


        //Hashmap <Datatype_key, Datatype_value> Var_Name = new Hashmap<>();


        HashMap <Integer , String>  map = new HashMap<>();

        //add
        map.put(1, "Java");
        map.put(2,"Spring");
        map.put(3, "Java8");
//get
        System.out.println("Map : " +map.get(3)+ " " +map.get(2)+" "+map.get(1));

        for (Integer output : map.keySet()){
            System.out.println("Using key method : " +map.get(output));
        }


        HashMap <String , Double> mapDouble= new HashMap<>();

        mapDouble.put("A", 12.1);
        mapDouble.put("B", 13.1);
        mapDouble.put("C", 14.1);

        System.out.println("Double Value : " +mapDouble.get("A")+" "+mapDouble.get("B")+" "+mapDouble.get("C"));

        for (String Value : mapDouble.keySet()){

            System.out.println("Using key method : " +mapDouble.get(Value));
        }



        HashMap <String, String> mapString = new HashMap<>();

        mapString.put("A", "Agra");
        mapString.put("B", "Kolkata");
        mapString.put("C", "Bangalore");

        System.out.println("City : " +mapString.get("A")+" "+mapString.get("B")+" "+mapString.get("C"));

        //keySet ()b//it will return all the key in HashSet form

        for (String var : mapString.keySet()) {
            System.out.println("Using key in get method : " +mapString.get(var));
        }


    }
}
