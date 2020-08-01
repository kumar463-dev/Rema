public class RemoveSpecialChar {
    public static void main(String[] args) {
        // using regular expression [a-zA-Z0-9]

        String s = "Hello ((^*%&&((*( Java ()*(^^&* Nitin ()(*&^%$^&*()K()()(";
        s = s.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s);
    }
}
