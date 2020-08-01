package DataStructurePractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class A{

    public static void main(String[] args) {

        String s = "AAAAbCCCCddEEfggg";
        s = s.toLowerCase();

        char[] c = s.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for(Character cc : c){
            charSet.add(cc);
        }

        StringBuilder sb = new StringBuilder();
        for ( Character c2 : charSet){
            sb.append(c2);
        }
        System.out.println(sb);

    }
}