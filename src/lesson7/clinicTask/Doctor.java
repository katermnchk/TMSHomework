package lesson7.clinicTask;

import java.util.Scanner;

public class Doctor {
    private final String doctorType;
    private final String name;

    Doctor(String doctorType, String name){
        this.doctorType = doctorType;
        this.name = name;
    }

    void treat(){
        System.out.println("The treatment method is still unknown...");
    }

    public String getFullInfo(){
        return "doctor type: " + doctorType + "\n" + "doctor name: " + name;
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
