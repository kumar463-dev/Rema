package OOPsConcept;

public class TestCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
        Car cb = new BMW();
        cb.start();
        cb.stop();
        c.stop(2);
        System.out.println(" ************** ");

        //Top casting : Dynamic polymorphism
        Car ccb = new BMW();
        ccb.stop();
        ccb.start();

        //Downcasting ClassCastException
        BMW bb = (BMW) new Car();


    }
}
