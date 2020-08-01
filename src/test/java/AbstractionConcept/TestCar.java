package AbstractionConcept;

public class TestCar {

    public static void main(String[] args) {
        BMW b = new BMW();
        b.brake();
        b.refuel();
        b.start();
        b.theSafety();

        Car c = new BMW();
        c.refuel();
        c.brake();
        c.start();
    }
}
