import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RecipeManager {
    private Map<String, Recipe> recipes;

    public RecipeManager() {
        recipes = new HashMap<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.put(recipe.getName(), recipe);
    }

    public Recipe getRecipe(String name) {
        return recipes.get(name);
    }

    public Set<String> getAllRecipeNames() {
        return recipes.keySet();
    }

    public void removeRecipe(String name) {
        recipes.remove(name);
    }

    public void listAllRecipes() {
        for (String recipeName : recipes.keySet()) {
            System.out.println(recipes.get(recipeName));
        }
    }
}
