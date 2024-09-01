public class MyMain {
    public static void main(String[] args) {
        getUserTask();
    }

    static void getUserTask() {
        SystemUser[] users = new SystemUser[] {
            new SystemUser("Kate", 18),
                new SystemUser("Kate", 18),
            new SystemUser("Ilya", 18)
        };

        for (SystemUser user: users) {
            System.out.println(user);
            System.out.println("HashCode: " + user.hashCode());
            System.out.println("------------------------");
        }

        System.out.println(users[0].equals(users[1]));
        System.out.println(users[1].equals(users[2]));
    }
}
