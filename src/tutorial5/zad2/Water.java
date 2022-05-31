package zad2;

public class Water extends Liquid{

    private boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    @Override
    public int getReagent() {
        if(distilated)
            return super.getReagent();
        else
            return super.getReagent()/2;
    }
}
