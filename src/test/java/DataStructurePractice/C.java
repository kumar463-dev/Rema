package DataStructurePractice;

import java.util.HashMap;
import java.util.Map;

public class C {
    public static void main(String[] args) {
        String str = "Hello Hello how Hello are you";
        String[] split = str.split(" ");


        Map<String,Integer> m = new HashMap<String,Integer>();
        for(int i=0; i<split.length;i++){
            if(m.containsKey(split[i])){
                int count = m.get(split[i]);
                m.put(split[i], count+1);
            }
            else
                m.put(split[i],1);
        }
        System.out.println(m);
    }
}
