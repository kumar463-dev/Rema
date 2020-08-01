package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class  ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("FRIENDS");
        tvSeries.add("Two and a half men");
        tvSeries.add("Money Hiest");
        tvSeries.add("The Stranger Things");
        tvSeries.add("Narcos");

        System.out.println("******* Print using For-Each Lambda Expression *************");


        //1. Using 1.8 JDF for-each look & lambda expression
        tvSeries.forEach(shows -> {
            System.out.println(shows);
        });

        System.out.println("******* Print using Iterator *************");

        //2. Using Iterator
         Iterator<String> it = tvSeries.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }

         //3. Using Iterator & java 8 forEachRemaining Method
        System.out.println("******* Using Iterator & java 8 forEachRemaining Method **********");
         it = tvSeries.iterator();
         it.forEachRemaining(show -> {
             System.out.println(show);
         });

        //4. Using for each loop
        System.out.println("******* Using For Each Loop **********");
        for (String show : tvSeries){
            System.out.println(show);
        }

        //5. Using for loop with index
        System.out.println("******* Using for loop with index **********");
        for(int i=0; i<tvSeries.size();i++){
            System.out.println(tvSeries.get(i));
        }
    }
}
