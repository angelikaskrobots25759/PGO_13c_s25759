package zad2;

public class Ore extends Mineral{

    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    @Override
    public int getReagent() {
        if(metallic)
            return super.getReagent();
        else
            return super.getReagent()/2;
    }
}
