package zad2;

public class Alcohol extends Liquid{

    private int percentage = 0;

    public Alcohol(String name, int baseReagent, int dissolubility, int percentage) {
        super(name, baseReagent, dissolubility);
        if(percentage >= 0 && percentage <= 100)
            this.percentage = percentage;
    }

    @Override
    public int getReagent() {
        return super.getReagent() - (super.getReagent() * percentage/100);
    }
}
