public class SystemUser {
    private String name;
    private int age;

    public SystemUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "System user" + "\nName: " + name + "\nAge: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        SystemUser temp = (SystemUser) obj;
        return (this.name.equals(temp.name)) && (this.age == temp.age);
    }

    @Override
    public int hashCode() {
        int newHashCode = name.hashCode();
        newHashCode = 19 * newHashCode + age;
        return newHashCode;
    }
}
