package zad2;

public class Plant extends Ingredient{

    private int toxity;

    public Plant(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        this.toxity = toxity;
    }

    @Override
    public int getReagent() {
        return super.getReagent() * toxity;
    }
}
