package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("FRIENDS");
        tvSeries.add("Two & half Men");
        tvSeries.add("Money Hiest");

        // 1. Using for each lambda expression . in JDK 1.8
        System.out.println("**** Using for each lambda expression . in JDK 1.8 ***");
        tvSeries.forEach(show ->{
            System.out.println(show);
        });

        //2. Using Iterator
        System.out.println("**** Using Iterator ***");

        Iterator<String> it =  tvSeries.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //3. Using Iterator with forEachRemaining method
        System.out.println("**** Using Iterator with forEachRemaining method ***");

        it = tvSeries.iterator();
        it.forEachRemaining(show ->{
            System.out.println(show);
        });

        //4. Using for advance loop
        System.out.println("**** Using for advance loop ***");

        for(String show : tvSeries){
            System.out.println(show);
        }


        //Using for loop with index
        System.out.println("**** Using for loop with index ***");
        for(int i = 0; i<tvSeries.size(); i++){
            System.out.println(tvSeries.get(i));
        }



    }
}
