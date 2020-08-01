public class finalfinally {

    public void finalize(){
        System.out.println("Finalize method");
    }

    public static void main(String[] args) {
//    test();
//        test1();
        finalfinally f1 = new finalfinally();
        finalfinally f2 = new finalfinally();
        f1=null;
        f2 = null;
        System.gc();
    }

    public static void test(){
        try{
            System.out.println("From Try block");
//            throw new RuntimeException("Test");
        }catch (Exception e){
            System.out.println("From Catch Block");
        }finally {
            System.out.println("From Finally");
        }
    }

    public static  void test1(){
        int i =10;
        try{
            System.out.println("Inside try block");
            int k = i/0;
        }catch (NullPointerException e){
            System.out.println("Exception handled in Catch block");
        }finally {
            System.out.println("Inside finally block");
        }


    }

}

