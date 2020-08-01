public class Paliandrom{
    public static void isPalindrome(int n){
        int r =0;
        int sum =0;
        int temp;
        temp =n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if (temp == sum){
            System.out.println("PPPPPPPP");
        }else
            System.out.println("NOTTTTTTTTTTTTTTT");
    }

    public static void main(String[] args) {
        isPalindrome(13223133);
    }
}