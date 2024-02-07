package JavaSE.TestStreamApi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // создаем список машин
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Subaru", 240, 3.2));
        cars.add(new Car("Porsche", 300, 4.0));
        cars.add(new Car("BMW", 220, 2.8));
        cars.add(new Car("Mercedes", 280, 3.5));

        CarCity[] carCity = new CarCity[cars.size()];
        for (Car element: cars) {

        }

        // выводим марку первой машины с объемом двигателя больше 3.0
        System.out.println(carCity);

    }
}
