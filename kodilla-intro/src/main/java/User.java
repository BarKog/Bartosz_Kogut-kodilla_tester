public class User {
    final String name;
    final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User krilin = new User("Krilin", 30);
        User songo = new User("Songo", 33);
        User trunks = new User("Trunks", 4);
        User vegeta = new User("Vegeta", 32);

        User[] users = {krilin, songo, vegeta, trunks};

        int result = 0;
        double average;
        int userNumber = users.length;
        for (User user : users) {
            result = result + user.age;
        }
        average = result / users.length;

        for (User user : users) {
            if (user.age < average) {
                System.out.println(user.name);
            } else {
                System.out.println("Nobody");
            }
        }
    }
}