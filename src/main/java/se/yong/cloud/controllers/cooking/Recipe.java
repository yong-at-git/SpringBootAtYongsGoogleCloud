package se.yong.cloud.controllers.cooking;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Yong Huang <yong.huang@mitel.com> on 2017-11-12.
 */
public class Recipe {
    private String name;
    private Map<String, String> ingredients = new HashMap<>();
    private String steps = "";

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        Objects.requireNonNull(steps);
        this.steps = steps;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Recipe recipe = (Recipe) o;

        if (name != null ? !name.equals(recipe.name) : recipe.name != null)
            return false;
        if (ingredients != null ? !ingredients.equals(recipe.ingredients) : recipe.ingredients != null)
            return false;
        return steps != null ? steps.equals(recipe.steps) : recipe.steps == null;
    }

    @Override public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        result = 31 * result + (steps != null ? steps.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        return "Recipe{" +
            "name='" + name + '\'' +
            ", ingredients=" + ingredients +
            ", steps='" + steps + '\'' +
            '}';
    }
}
