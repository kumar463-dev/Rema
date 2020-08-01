package AbstractionConcept;

public abstract class Bank {

    int amt =100;
    final int rate = 10;
    static int loanRate =5;
    public abstract void loan(); //abstract method -- No body

    // Can't create object of abstract class
    //Can't create object of Interface as
    public void credit(){
        System.out.println("Credit");
    }
    public void debit(){
        System.out.println("Debit");
    }
}
