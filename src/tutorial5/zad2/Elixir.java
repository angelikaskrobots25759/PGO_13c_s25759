package zad2;

import java.util.ArrayList;
import java.util.List;

public class Elixir {

    private String name;
    private boolean isCreated = false;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Liquid catalyst;
    private int power;

    public Elixir(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient){
        if(!isCreated){
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient){
        if(!isCreated){
            ingredients.remove(ingredient);
        }
    }

    public void create(){
        if(!isCreated){
            int powerTemp = 0;
            for(Ingredient ingredient : ingredients){
                powerTemp = ingredient.getReagent();
            }
            power = powerTemp/catalyst.getReagent();
            isCreated = true;
        }
    }

    public void setCatalyst(Liquid catalyst) {
        if(!isCreated)
            this.catalyst = catalyst;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "name='" + name + '\'' +
                ", isCreated=" + isCreated +
                ", catalyst=" + catalyst +
                ", power=" + power +
                '}';
    }
}
