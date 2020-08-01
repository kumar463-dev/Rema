package DataStructurePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B {
    public static void main(String[] args) {

        Map<String,String> phonebook = new HashMap<String, String>();
        phonebook.put("Nitin", "9483748374");
        phonebook.put("Richa", "94397437333");
        phonebook.put("Manish", "8658654654");

//        System.out.println(phonebook.get("Nitin"));

        Set<String> s = phonebook.keySet();
        for(String i : s){
            System.out.println(i +":"+ phonebook.get(i));
        }

        Set<Map.Entry<String,String>> values = phonebook.entrySet();
        for (Map.Entry<String,String> entry : values){
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }

    }

}
