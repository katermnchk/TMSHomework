package lesson7.clinic;

public class Patient {
    private String name;
    private int treatmentPlan;
    private Doctor doctor;

    Patient(String name){
        this.name = name;
    }

    public void setTreatment(int treatmentPlan, Doctor doctor) {
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    String getName(){
        return "patient name: " + name;
    }

}
