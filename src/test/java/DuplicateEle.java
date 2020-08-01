import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateEle {
    public static void main(String[] args) {
        String names[] = {"Java", "C", "Python", "Ruby", "Ruby", "C"};
        // Using For Loop
        for (int i=0; i<names.length;i++){
            for(int j=i+1; j<names.length; j++){
                if(names[i]==names[j]){
                    System.out.println("Duplicate Name is: "+ names[i]);
                }
            }
        }
        System.out.println("__________________________________________");
        //Using HashSet
        Set<String> s = new HashSet<String>();
        for(String name : names){
            if(s.add(name)==false){
                System.out.println("Duplicate name is: "+ name);
            }
        }

        //Using Hashmap
        Map<String,Integer> storeMap = new HashMap<String, Integer>();
            for(String n: names){
                Integer count = storeMap.get(n);
                if(count == null){
                    storeMap.put(n,1);
            }else
                storeMap.put(n,++count);
        }
            System.out.println(storeMap);

            storeMap.entrySet();
            Set<Map.Entry<String,Integer>> entrySet = storeMap.entrySet();
            for(Map.Entry<String,Integer> entry : entrySet){
                if(entry.getValue()>1){
                    System.out.println("Duplicate value: "+ entry.getKey());
                }
            }
    }
}