package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class hashMapDay2_arr {

    public static void main(String[] args) {

        //SYNTAX: HashMap <Datatype_key, Datatype_value> = new HashMap<>();

        HashMap <Integer, ArrayList<String>> hashMap= new HashMap<>();

        ArrayList <String> cityList= new ArrayList<>();
        cityList.add("Agra");
        cityList.add("Kanpur");
        cityList.add("Delhi");

        hashMap.put(1, cityList); //return list of city

        ArrayList <String> courseList = new ArrayList<>();;
        courseList.add("Java");
        courseList.add("Spring");
        courseList.add("Spring Boot");

        hashMap.put(2, courseList); // return list of courses

        hashMap.get(1);

        for (String var : cityList){

            System.out.println("Print City list : " +var);
        }

        hashMap.get(2);
        for (String var : courseList){

            System.out.println("Print Course List : " +var);
        }

    }
}
