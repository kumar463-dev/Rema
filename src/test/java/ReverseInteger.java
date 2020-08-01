public class ReverseInteger {
    public static int reverseNum(int n){
        int temp;
        int r=0, sum=0;
        temp= n;
        while(n>0){
            r = n%10;
            sum= (sum*10)+r;
            n= n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
//        reverseNum(2113);
        System.out.println(reverseNum(2333));

        //Using StringBugger
        long num1 = 1234567;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
