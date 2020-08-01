package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args) {
        //it is similar to hashMap, but it's syncronized
        //stores values in key-value manner
        // key --> Object --> HashCode >> value

        Hashtable h = new Hashtable();
        h.put(1, "Tim");
        h.put(2, "Nike");
        h.put(3, "Ramu");

        //clone copy creation
        Hashtable h1 = new Hashtable();
        h1 = (Hashtable) h.clone() ;
        System.out.println("Values from h: "+ h);
        System.out.println("Values from h1: "+ h1);

        h.clear();
        System.out.println("Values from h: "+ h);
        System.out.println("Values from h1: "+ h1);

        //contains value
        Hashtable st = new Hashtable();
        st.put("A", "Nitin");
        st.put("B", "Manager");
        st.put("C", "Selenium");

        if(st.containsValue("Nitin"))
            System.out.println("Value Found");

        // print all values of Hashtable using Enumeration

        Enumeration et=  st.elements();
        while (et.hasMoreElements()){
            System.out.println(et.nextElement());
        }

        // Print all the values from HashTable using EntrySet
        Set s = st.entrySet();
        System.out.println(s);


        Hashtable st1 = new Hashtable();
        st1.put("A", "Nitin");
        st1.put("B", "Manager");
        st1.put("C", "Selenium");
        // check both hashTable are equal or not
        // null key & value is NOT allowed

        st.put("Hello", null);
        if(st.equals(st1)){
            System.out.println("Both are equal");
        }

        //get value from table by key
        System.out.println(st1.get("A"));

        //get the hashcode of the object from table
        System.out.println("Hashcode value: "+ st1.hashCode());
        System.out.println("Hashcode value: "+ st.hashCode());

        //generics
        Hashtable<String,String> h3 = new Hashtable<String,String>();

    }
}
