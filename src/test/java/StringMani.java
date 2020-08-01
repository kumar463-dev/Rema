
public class StringMani {
    public static void main(String[] args) {
        String s = "It's a long way to go";
        String s1 = "It's a Long way to go";


        System.out.println(s.length());
        System.out.println(s.charAt(7));
        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf("a",s.indexOf('a')+1));
        System.out.println(s.indexOf("long"));
        System.out.println(s.indexOf("hello"));

        // String comparison
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.substring(0,9));

        String s3= "     hello Nike    ";
        System.out.println(s3.trim());
        System.out.println((s3.trim()).replace(" ", "*"));
        String date = "29-07-1991";
        System.out.println(date.replace("-", "/"));

        String s4= "This is a cool amazing place";
        String[] val =s4.split(" ");
        for(int i =0; i<val.length; i++){
            System.out.println(val[i]);
        }

        String f = "Hello";
        String f1= "Java";
        int a = 100;
        int b= 200;
        System.out.println(f+f1);
        System.out.println(f.concat(f1));
        System.out.println(a+b);
        System.out.println(f+f1+a+b);
        System.out.println(a+b+f+f1);
        System.out.println(f+f1+(a+b));








    }
}