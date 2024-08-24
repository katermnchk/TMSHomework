package lesson7.clinic;

public class Dentist extends Doctor {
    Dentist(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    void treat() {
        System.out.println("The dentist cured your teeth. Be healthy!");
    }
}
