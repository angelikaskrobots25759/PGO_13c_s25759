package tutorial6.zad1;

public class Employee extends Person{
    private double salary;

    @Override
    public double getIncome() {
        return salary-(salary*0.2);
    }
}
