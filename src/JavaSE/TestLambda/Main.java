package JavaSE.TestLambda;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        database.addPerson(new Person("Zhansaya", 20));
        database.addPerson(new Person("Jenni", 24));
        database.addPerson(new Person("Bob", 12));
        database.addPerson(new Person("Alice", 21));
        database.addPerson(new Person("Beknur", 23));
        database.addPerson(new Person("Nurbek", 10));
        database.printYoungPeopleNames();

    }
}
