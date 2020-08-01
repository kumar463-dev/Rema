package AbstractionConcept;

public class BMW implements Car{


    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void brake() {
        System.out.println("BMW Stop");

    }

    @Override
    public void refuel() {
        System.out.println("BMW Refuel");
    }
    public void theSafety(){
        System.out.println("Safe");
    }
}
