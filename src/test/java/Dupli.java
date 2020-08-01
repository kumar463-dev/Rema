import java.sql.SQLSyntaxErrorException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dupli{
    public static void main(String[] args) {

        String[] names = {"Java", "C", "Java"};
        for(int i=0; i<names.length; i++){
            for(int j=i+1; j<names.length;j++){
                if(names[i]==names[j]){
                    System.out.println("Duplicate: "+ names[i]);
                }
            }
                    }

        Set<String > h = new HashSet<String>();
        for(String name : names){
            if(h.add(name)==false){
                System.out.println("Duplicate: "+ name);
            }
        }


        Map<String,Integer> m = new HashMap<String,Integer>();
        for(String name : names){
            Integer count = m.get(name);
            if(count == null){
                m.put(name, 1);
            }else
            {
                m.put(name,++count);
            }
        }
        System.out.println(m);

        Set<Map.Entry<String,Integer>> entry =  m.entrySet();
        for(Map.Entry<String ,Integer> e : entry){
            if(e.getValue()>1){
                System.out.println("Duplicate: "+ e.getKey());
            }
        }
    }
}