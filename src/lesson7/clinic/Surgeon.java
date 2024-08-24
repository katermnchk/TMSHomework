package lesson7.clinic;

public class Surgeon extends Doctor {
    Surgeon(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    void treat() {
        System.out.println("The surgeon cured the fracture. Be healthy!");
    }
}
