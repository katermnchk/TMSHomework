package lesson7.clinic;

public class Clinic {
    public static void main(String[] args) {
        createClinic();
    }

    public static void createClinic(){
        Doctor[] clinic = new Doctor[]{
                new Surgeon("surgeon", "Ivan"),
                new Dentist("dentist", "Anton"),
                new Therapist("therapist", "Mary")
        };
        Patient patient = new Patient("Pavel");
        Therapist.chooseTreatmentPlan(patient, clinic);
        System.out.println("-------------------------------");
        System.out.println(patient.getDoctor().getFullInfo());
        System.out.println(patient.getName());
    }

}


