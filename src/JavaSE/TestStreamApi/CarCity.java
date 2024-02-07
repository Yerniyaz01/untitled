package JavaSE.TestStreamApi;

import java.util.ArrayList;

public class CarCity {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarCity() {

    }

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    void addCar(Car car) {
        cars.add(car);
    }

    Car firstGreatVolumeCar() {
        return cars.stream().filter(car -> car.getEngineVolume()>3.0)
                .sorted((s1,s2) -> Double.compare(s2.getEngineVolume(),s1.getEngineVolume()))
                .findFirst().get();
    }
//    sorted((c1, c2) -> Double.compare(c2.getEngineVolume(), c1.getEngineVolume()))
//                .findFirst().get();

}
