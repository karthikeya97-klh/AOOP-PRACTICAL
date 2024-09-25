import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private String name;
    private Map<Ingredient, Integer> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addIngredient(Ingredient ingredient, int quantity) {
        ingredients.put(ingredient, quantity);
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recipe: ").append(name).append("\nIngredients:\n");
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            sb.append("- ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
