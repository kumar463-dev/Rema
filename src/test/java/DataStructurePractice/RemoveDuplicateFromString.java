package DataStructurePractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String s = "AABCCDDDEFFGG";
        char[] c = s.toCharArray();

        Set<Character> charSet = new LinkedHashSet<Character>();
        for(Character cc : c){
            charSet.add(cc);
        }
        System.out.println("In Set: "+charSet);

        StringBuilder sb = new StringBuilder();
        for (Character s1 : charSet){
            sb.append(s1);
        }
        System.out.println(sb);
    }
}

