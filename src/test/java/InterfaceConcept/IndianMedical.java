package InterfaceConcept;

public interface IndianMedical extends WHO {

    public  void emergencyServices();
    public void neuroServices();
    public void RadiologyServices();

    int minFee= 100;

    //Can not create object of Interface
    //Only Method declaration -- method prototype - no method body -- abstract method
    //Can not create static prototype method in Interface
    //but interface Var are static & final by nature

    //static method with method body



    //From JDK 1.8 you can have static methods in interface but with method body
    //Static method with body
    public static void service_911(){
        System.out.println("India 911");
    }

    default void internship(){
        System.out.println("Indian Internship");
    }
}

