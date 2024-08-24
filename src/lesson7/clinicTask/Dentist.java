package lesson7.clinicTask;

public class Dentist extends Doctor {
    public Dentist(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    void treat() {
        System.out.println("The dentist cured your teeth. Be healthy!");
    }
}
