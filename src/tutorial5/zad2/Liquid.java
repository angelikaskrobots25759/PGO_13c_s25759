package zad2;

public class Liquid extends Ingredient{
    private int dissolubility = 0;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        if(dissolubility >= 0 && dissolubility <= 100)
            this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return super.getReagent() - (super.getReagent() * (dissolubility/100));
    }
}
