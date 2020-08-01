import java.util.Scanner;

public class Arm {
    public static void isArm(int n){
        int cube=0;
        int r, t;
        t=n;
        while (n>0){
            r = n %10;
            n=n/10;
            cube= cube+ (r*r*r);
        }
        if(t==cube){
            System.out.println("ARMMMMMMM");
        }
        else
            System.out.println("NOTTTTTTTTTTT ARMMMMMMM");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to check ARMMMMMM");
        int n= s.nextInt();
        isArm(n);
    }

}

// In OOPs , a singleton  class is a class which have only one instance of the class at a time
//How to design Singleton class
//1. Make sure Constructor as Private
//2. write public static method which have return type of object of singleton class (Lazy initialization)
