package lesson7.clinic;

import java.util.Scanner;

public class Doctor {
    private String doctorType;
    private String name;

    Doctor(String doctorType, String name){
        this.doctorType = doctorType;
        this.name = name;
    }

    void treat(){
        System.out.println("The treatment method is still unknown...");
    }

    String getFullInfo(){
        return "doctor type: " + doctorType + "\n" + "doctor name: " + name;
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
