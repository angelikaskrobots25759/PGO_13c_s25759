package tutorial6.zad1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public abstract class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public abstract double getIncome();

    public int getAgeInYears(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
