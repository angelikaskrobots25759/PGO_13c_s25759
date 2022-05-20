package tutorial3.Zad1;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private List<Car> cars = new ArrayList<>();

    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(int weight){
        cars.add(new Car(weight));
    }

    public int getWeight(){
        int weight = 0;
        for(Car car: cars)
            weight += car.getWeight();
        return weight;
    }
}
