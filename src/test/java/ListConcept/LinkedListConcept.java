package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("test");
        ll.add("Selenium");
        ll.add("Java");
        ll.add("RPA");
        ll.add("RFT");
//Print
        System.out.println("Content of LL: "+ ll);

        //Add first
        ll.addFirst("Hello");
        ll.addLast("Automation");
        System.out.println("Content of LL: "+ ll);

        //get
        System.out.println(ll.get(1));
        //set
        ll.set(1, "Nitin");
        System.out.println(ll.get(1));

        //remove first & last element
        ll.removeFirst();
        ll.removeLast();
        ll.remove(0 );
        System.out.println(ll);

        // print all the values of LL
        //using for loop
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
System.out.println("***************");
        //using advance for loop
        for(String s: ll){
            System.out.println(s);
        }
        System.out.println("***************");

        //using Itrator
        Iterator<String> it=  ll.iterator();
        while (it.hasNext()){
//            String str = it.next();
            System.out.println(it.next());
        }
        System.out.println("***************");

        //Using While Loop
        int num =0;
        while (ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }

    }
}
