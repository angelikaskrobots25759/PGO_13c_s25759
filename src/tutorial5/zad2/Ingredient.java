package zad2;

public class Ingredient {
    private String name;
    private int baseReagent;

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    public int getReagent() {
        return baseReagent;
    }
}
