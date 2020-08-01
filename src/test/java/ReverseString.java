public class ReverseString {
    public static void main(String[] args) {
        String s = "Selenium";
        int len = s.length();
        String rev = "";

        //Using for loop
        for (int i =len-1; i>=0;i--){

            rev= rev+s.charAt(i);
        }
        System.out.println(rev);


        //Using StringBuffer Class
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());


        String s1 = "My name nitin";
        String[] s2 = s1.split(" ");
        String rev1 = "";
        System.out.println(s2);

        for(int i  = s2.length; i>=0; i--){

        }
    }
}
