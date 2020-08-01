package OOPsConcept;

public class Car {

    public void start(){
        System.out.println("Start car");
    }

    public void stop(){
        System.out.println("Stop car");
    }

    public void stop(int i){
        System.out.println("Stop AWS car");
    }

    public static void main(String[] args) {
        Car cc = new Car();
        cc.stop(22);

    }



}
