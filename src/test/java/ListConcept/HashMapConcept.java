package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {

    public static void main(String[] args) {

        //HashMap is a class which extend Map Interface
        // extend Abstract Map
        // Contain only unique elements
        // stores value in form of key & value pair
        // it may have one null key and multiple values
        // it maintains no order
        // HashMap is not synchronized -- Not thread safe
        //Cocurrent modifcation exception --- fail - fast condition


        HashMap<Integer, String > hm = new HashMap<Integer, String>();
        hm.put(1,"Java");
        hm.put(1,"Selenium");
        hm.put(3,"TestNG");
        hm.put(null,"Hello");
        hm.put(null,"World");
        hm.put(null,null);



//        System.out.println(hm.get(1));
//        System.out.println(hm.get(4));

        Set<Map.Entry<Integer,String>> e =  hm.entrySet();

        for(Map.Entry<Integer,String> m : e){

         System.out.println(m.getKey() + " --> "+ m.getValue());
        }

        System.out.println("***************************");


        hm.remove(2);
        System.out.println(hm);
        System.out.println("***************************");

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

        Employee e1 = new Employee(23,"Tim", "QA");
        Employee e2 = new Employee(25,"Kim", "HR");
        Employee e3 = new Employee(29,"Harry", "SALES");
        emp.put(1, e1);
        emp.put(2, e2);
        emp.put(3, e3);

        // iterate the values

        for(Map.Entry<Integer, Employee> ee : emp.entrySet()){
            int key = ee.getKey();
            Employee e22 = ee.getValue();
            System.out.println(key+ " Information ------");
            System.out.println(e22.Name+ " "+ e22.Dept+ " "+ e22.age);
        }



    }
}

