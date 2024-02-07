package JavaSE.TestClass;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {

    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" + "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

//Продолжайте работать над предыдущим классом Player.
//Создайте метод String toString(). Данный метод возвращает данные по каждому игроку, то есть все поля в один ряд.