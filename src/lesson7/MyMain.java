package lesson7;

import lesson7.appleTask.Apple;
import lesson7.clinicTask.*;

public class MyMain {
    public static void main(String[] args) {
        createClinic();
        //changeAppleColor();
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

    public static void changeAppleColor(){
        Apple apple = new Apple("green");
    }

}


