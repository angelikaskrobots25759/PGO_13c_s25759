package tutorial6.zad2;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String surname, LocalDate dateOfBirth, double salary) {
        super(name, surname, dateOfBirth);
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary-(salary*0.2);
    }
}
