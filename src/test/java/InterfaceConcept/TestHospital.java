package InterfaceConcept;

public class TestHospital {
    public static void main(String[] args) {
        ApolloHospital ap = new ApolloHospital();
        ap.ambulanceServices();
        ap.emergencyServices();
        ap.ENTServices();
        ap.neuroServices();
        ap.medicalInsurance();
        ap.internship();
        ap.getPatientHistory();


        System.out.println(ap.minFee);
        System.out.println(IndianMedical.minFee);
        IndianMedical.service_911();
        // top Casting
        USMedical us = new ApolloHospital();
        us.physioServices();
        us.oncologyServices();
        us.orthopedicServices(); // Reference type check
        IndianMedical in = new ApolloHospital();
        in.internship();




    }
}
