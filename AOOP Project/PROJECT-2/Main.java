public class Main {
    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();

        // Create ingredients
        Ingredient sugar = new Ingredient("Sugar", "grams");
        Ingredient flour = new Ingredient("Flour", "grams");
        Ingredient eggs = new Ingredient("Eggs", "pieces");

        // Create a recipe
        Recipe pancake = new Recipe("Pancake");
        pancake.addIngredient(sugar, 50);
        pancake.addIngredient(flour, 200);
        pancake.addIngredient(eggs, 2);

        // Add recipe to manager
        manager.addRecipe(pancake);

        // Another recipe
        Recipe cake = new Recipe("Cake");
        cake.addIngredient(sugar, 100);
        cake.addIngredient(flour, 300);
        cake.addIngredient(eggs, 3);

        // Add second recipe
        manager.addRecipe(cake);

        // List all recipes
        System.out.println("All Recipes:");
        manager.listAllRecipes();

        // Fetch a specific recipe
        Recipe fetchedRecipe = manager.getRecipe("Pancake");
        System.out.println("\nFetched Recipe: " + fetchedRecipe);
    }
}
