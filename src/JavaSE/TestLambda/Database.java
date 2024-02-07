package JavaSE.TestLambda;

import java.util.*;

public class Database {
    private List<Person> personList = new ArrayList<>();
    private List<String> personName = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void printYoungPeopleNames() {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getAge() > 18 && personList.get(i).getAge() < 30) {
                personName.add(personList.get(i).getName());
            }
        }

        personName.sort((s1, s2) -> s1.compareTo(s2));
        for (String element : personName) {
            System.out.println(element);
        }
    }
}
