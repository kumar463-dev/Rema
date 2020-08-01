package TestMain;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseStringArray {

    public static void main(String[] args) {
        String[] str = new String[]{"Monday", "Tuesday", "Wednesday"};
        List<String> list = Arrays.asList(str);
        Collections.reverse(list);
        System.out.println("Reversed");
        str = (String[]) list.toArray();
        for (int i=0; i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
