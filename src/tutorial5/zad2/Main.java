package zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(new Flower("Róża", 12, 3));
        ingredientList.add(new Crystal("Ametyst", 10, 2, 20));
        ingredientList.add(new Water("Woda źródlana", 30, 60, true));
        ingredientList.add(new Root("Marchew", 5, 0));
        ingredientList.add(new Alcohol("Wóda", 100, 3,40));

        Liquid catalyst = new Water("Woda ze ścieków", 2, 1, false);

        Elixir elixir = new Elixir("Elixir1");
        elixir.setCatalyst(catalyst);
        for(Ingredient ingredient : ingredientList)
            elixir.addIngredient(ingredient);

        elixir.create();
        System.out.println(elixir);
    }
}
