package tutorial6.zad1;

public class Student extends Person{

    private double scholarship;

    @Override
    public double getIncome() {
        return scholarship;
    }
}
