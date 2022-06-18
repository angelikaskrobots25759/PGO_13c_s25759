package tutorial6.zad2;

import java.time.LocalDate;

public class Student extends Person {

    private double scholarship;

    public Student(String name, String surname, LocalDate dateOfBirth, double scholarship) {
        super(name, surname, dateOfBirth);
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }
}
