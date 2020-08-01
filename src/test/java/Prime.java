public class Prime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void findPrime(int num){
        for(int i =2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
//        System.out.print("12 is prime number: "+ isPrime(2));
        findPrime(100 );
    }
}