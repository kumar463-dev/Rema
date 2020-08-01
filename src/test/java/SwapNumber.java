public class SwapNumber{
    public static void main(String[] args) {
        int a = 10;
        int b= 22;

        System.out.println("Before swaping a= "+a);
        System.out.println("Before swaping b= "+b);

        // Using 3rd variable
//        int temp;
//        temp= a; //10
//        a=b; //22
//        b= temp; //10
//        System.out.println("After swaping a= "+a);
//        System.out.println("After swaping b= "+b);


        // Without 3rd variable
        a= a+b; //32
        b= a-b; //32-22= 10
        a= a-b; //32-10 = 22

        System.out.println("After Swaping a: "+ a);
        System.out.println("After Swaping b: "+ b);
    }
}