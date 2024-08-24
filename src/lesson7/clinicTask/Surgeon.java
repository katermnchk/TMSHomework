package lesson7.clinicTask;

public class Surgeon extends Doctor {
    public Surgeon(String doctorType, String name) {
        super(doctorType, name);
    }

    @Override
    void treat() {
        System.out.println("The surgeon cured the fracture. Be healthy!");
    }
}
