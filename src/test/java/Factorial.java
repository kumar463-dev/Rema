public class Factorial {

    // without recursive- use for loop
    public static int factorial(int n){
        int fact =1;
        for (int i =1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    // with recursive : function call itself

    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return (n*fact(n-1));
    }

    public static void main(String[] args) {
//        System.out.println(factorial(1));
          System.out.println(fact(2));
    }
}
