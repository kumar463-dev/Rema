package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static <E> void main(String[] args) {
        int a[] = new int[3];
        // ArrayList is dynamic in size
//        arrayList contain duplicate value
        //Maintain insertion order/sequence
        //Syncronized
        //allows random access to fetch the value
//        a[44]= 11;
          System.out.println(a.length);
        ArrayList ar = new ArrayList();
        ar.add(22);
        ar.add(30);
        ar.add(32);
        System.out.println(ar.size());
        ar.add(22);
        System.out.println(ar.size());
        System.out.println(ar.get(3));

        ar.add("hello");
        ar.add(true);
        ar.add('c');
        ar.add(23.322);
// print all the values from arrayList:
// for loop
        // iterator
        for(int i=0; i<ar.size();i++){
            System.out.print(ar.get(i) + " ");
        }
        //generic vs non-genric
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(2323);
//        ar1.add("String");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Hello");

        ArrayList<E> ar3 = new ArrayList<E>();

        System.out.println("__________________________");

        // Create object of Employee
        Employee e1 = new Employee(28, "Nitin", "QA");
        Employee e2 = new Employee(26, "Preeti", "QA");
        Employee e3 = new Employee(27, "Richa", "Sales");

        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        // Using Iterator to tranverse
        Iterator<Employee> it = ar4.iterator();

        // Traverse the records
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.age);
            System.out.println(emp.Name);
            System.out.println(emp.Dept);

        }

        // addAll function to add all values from one array to another
        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("QA");
        ar5.add("Selenium");
        ar5.add("Test");

        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("DEV");
        ar6.add("JAVA");
        ar6.add("Develop");
        System.out.println(ar5.size());

        ar5.addAll(ar6);
        System.out.println(ar5);

        for(int i =0; i<ar5.size(); i++){
            System.out.println(ar5.get(i));
        }
System.out.println("**************************");
//removeAll
        ar5.removeAll(ar6);
        for(int i = 0; i<ar5.size();i++){
            System.out.println(ar5.get(i));
        }

        System.out.println("**************************");

//retainAll
        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("QA");
        ar7.add("Selenium");
        ar7.add("Test");

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("QA");
        ar8.add("JAVA");
        ar8.add("Develop");

        ar7.retainAll(ar8);
        for (int i = 0; i<ar7.size();i++){
            System.out.println(ar8.get(i));
        }
    }

}
