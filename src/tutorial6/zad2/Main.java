package tutorial6.zad2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Employee("Romek", "Tatak", LocalDate.of(1999, 12, 5), 4000);
        Person person2 = new Employee("Michał", "Kamień", LocalDate.of(1998, 11, 7), 2000);

        Person olderPerson = Person.compareAge(person1, person2);
        System.out.println("Higher age has: " + olderPerson.getName());
        Person personWithGreaterSalary = Person.compareIncome(person1, person2);
        System.out.println("Greater salary has: " + personWithGreaterSalary.getName());

        System.out.print("Compare age, should return -1: ");
        System.out.println(person1.compareAge(person2));

        System.out.print("Compare salary, should return 1: ");
        System.out.println(person1.compareIncome(person2));
    }
}
