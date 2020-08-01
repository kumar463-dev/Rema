package AbstractionConcept;

public class TestBank {
    public static void main(String[] args) {
        HDFCBank h = new HDFCBank();
        h.loan();
        h.credit();
        h.debit();
        h.fund();

        ///create a instance of HDFC Bank but refered by Bank
        Bank b = new HDFCBank();
        b.credit();
        b.debit();
        b.loan();
    }
}
