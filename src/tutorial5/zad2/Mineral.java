package zad2;

public class Mineral extends Ingredient{


    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + power;
    }
}
