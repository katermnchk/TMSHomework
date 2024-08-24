package lesson7.clinic;

public class Therapist extends Doctor {
    Therapist(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    void treat() {
        System.out.println("The therapist cured the cold. Be healthy!");
    }

   public static void chooseTreatmentPlan(Patient patient, Doctor[] clinic){
        switch (showTreatmentPlan()){
            case 1 -> patient.setTreatment(1, clinic[0]);
            case 2 -> patient.setTreatment(2, clinic[1]);
            default -> patient.setTreatment(3, clinic[2]);
        }
        patient.getDoctor().treat();
    }

    private static int showTreatmentPlan(){
        System.out.println("\tA treatment plan");
        System.out.println("1 - if the patient has bone problems");
        System.out.println("2 - if the patient has teeth problems");
        System.out.println("any other number - if the patient has other problems");
        System.out.print("Please enter your choice: ");
        return getScanner().nextInt();
    }

}

