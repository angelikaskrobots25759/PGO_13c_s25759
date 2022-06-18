package tutorial6.zad2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person implements ComparablePerson{

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract double getIncome();

    public int getAgeInYears(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public static Person compareAge(Person p1, Person p2){
        int compare = p1.dateOfBirth.compareTo(p2.dateOfBirth);
        if(compare > 0)
            return p2;
        else
            return p1;
    }

    public static Person compareIncome(Person p1, Person p2){
        if(p1.getIncome() > p2.getIncome())
            return p1;
        else
            return p2;
    }

    @Override
    public int compareAge(Person p) {
        int compare = this.dateOfBirth.compareTo(p.dateOfBirth);
        if(compare > 0)
            return -1;
        else if(compare == 0)
            return 0;
        else
            return 1;
    }

    @Override
    public int compareIncome(Person p) {
        if(this.getIncome() > p.getIncome())
            return 1;
        else if(this.getIncome() == p.getIncome())
            return 0;
        else
            return -1;
    }

    public String getName() {
        return name;
    }
}
