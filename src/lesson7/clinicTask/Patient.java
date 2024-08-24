package lesson7.clinicTask;

public class Patient {
    private final String name;
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(String name){
        this.name = name;
    }

    public void setTreatment(int treatmentPlan, Doctor doctor) {
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getName(){
        return "patient name: " + name;
    }

}
