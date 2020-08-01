package InterfaceConcept;

public class ApolloHospital extends GlobalPatientData implements USMedical, UKMedical, IndianMedical{


    @Override
    public void physioServices() {
        System.out.println("Apollo - Physio");
    }

    @Override
    public void oncologyServices() {
        System.out.println("Apollo - Oncolo");
    }

    @Override
    public void orthopedicServices() {
        System.out.println("Apollo - Ortho");
    }

    @Override
    public void ENTServices() {
        System.out.println("Apollo - ENT");
    }

    @Override
    public void ambulanceServices() {
        System.out.println("Apollo - Ambulance");
    }

    @Override
    public void emergencyServices() {
        System.out.println("Apollo - Emergency");
    }

    @Override
    public void neuroServices() {
        System.out.println("Apollo - Neuro");
    }

    @Override
    public void RadiologyServices() {
        System.out.println("Radiology");
    }

    @Override
    public void internship() {
        System.out.println("Override Internship");
    }

    public void OPTServices(){
        System.out.println("Apollo - OPD");
    }

    public void medicalInsurance(){
        System.out.println("Apollo - Insurance");
    }

    public void pathalogyServices(){
        System.out.println("Apollo - Pathalogy");
    }

    //WHO
    @Override
    public void polioServices() {
        System.out.println("Apollo - Polio");
    }
}
