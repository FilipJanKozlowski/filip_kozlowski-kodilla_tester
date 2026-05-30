public class User {
    private String name;
    private int age;

    public User(String userName, int userAge) {
        this.name = userName;
        this.age = userAge;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
        User marcin = new User("Marcin", 18);
        User jan = new User("Jan", 25);
        User filip = new User("Filip", 47);
        User alicja = new User("Alicja", 30);
        User damian = new User("Damian", 64);
        User kacper = new User("Kacper", 53);
        User agata = new User("Agata", 12);
        User marlena = new User("Marlena", 33);
        User beata = new User("Beata", 81);
        User anna = new User("Anna", 42);
    User[] users = {marcin, jan, filip, alicja, damian, kacper, agata, marlena, beata, anna};
        int sum = 0;
        for (int i = 0; i < users.length; i++ ) {
            sum = sum + users[i].getAge();
        }
        int average = sum / users.length;
        System.out.println("Uzytkownicy, ktorych wiek jest ponizej sredniej: ");
        for (int i = 0; i < users.length; i++ ) {
            if ( users[i].getAge() < average ) {
                System.out.println(users[i].getName());
            }
        }
    }
    }