package TestMain;

public class TestBase {
    public static void main(String[] args) {
        System.out.println("Main Method");
        main(2);
        main("Hello");
        main(2,3);

    }

    public static void main(int a) {
        System.out.println("Main Method 1");
    }

    public static void main(int a, int b) {
        System.out.println("Main Method 2");
    }

    public static void main(String agrs) {
        System.out.println("Main Method 3");
    }

}
