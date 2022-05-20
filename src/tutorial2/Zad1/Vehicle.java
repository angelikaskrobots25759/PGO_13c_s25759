package tutorial2.Zad1;


import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String name;
    private LocalDate creationDate;
    private List<Wheel> wheels;
    private Brand brand;
    private Insurance insurance;
    private static List<Vehicle> allVehicles = new ArrayList<>();

    public Vehicle(String name, LocalDate creationDate, List<Wheel> wheels, Insurance insurance) {
        this.insurance = insurance;
        if(insurance == null)
            throw new IllegalArgumentException("Auto musi miec ubezpieczenie");
        if(wheels.size() < 2)
            throw new IllegalArgumentException("Podano mniej niż 2 koła");
        this.name = name;
        this.creationDate = creationDate;
        this.wheels = wheels;
        allVehicles.add(this);
    }

    public Vehicle(String name, List<Wheel> wheels, Insurance insurance) {
        this.insurance = insurance;
        if(insurance == null)
            throw new IllegalArgumentException("Auto musi miec ubezpieczenie");
        if(wheels.size() < 2)
            throw new IllegalArgumentException("Podano mniej niż 2 koła");
        this.name = name;
        this.wheels = wheels;
        allVehicles.add(this);
    }

    public static List<Vehicle> findByName(String name){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle : allVehicles){
            if(vehicle.name.equals(name))
                result.add(vehicle);
        }
        return result;
    }

    public void addWheel(){
        wheels.add(new Wheel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public long getAge() {
        if(creationDate == null)
            return 0;
        return Duration.between(LocalDate.now(), creationDate).toDays();
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
