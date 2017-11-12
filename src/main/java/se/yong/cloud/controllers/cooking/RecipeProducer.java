package se.yong.cloud.controllers.cooking;

import java.util.Optional;

/**
 * Created by Yong Huang <yong.e.huang@gmail.com> on 2017-11-12.
 */
public class RecipeProducer {
    public static Optional<Recipe> getRecipe(RecipeName recipeName) {
        switch (recipeName) {
            case CHINESE_TOMATO_EGG_STIR_FRY:
                return Optional.of(getTomatoEggStirFry());
            default:
                return Optional.empty();
        }
    }

    private static Recipe getTomatoEggStirFry() {
        Recipe tomatoEggStirFry = new Recipe(RecipeName.CHINESE_TOMATO_EGG_STIR_FRY.getFullName());

        tomatoEggStirFry.getIngredients().put("Egg", "4");
        tomatoEggStirFry.getIngredients().put("Tomato", "4");
        tomatoEggStirFry.getIngredients().put("Spring onion", "10g");
        tomatoEggStirFry.getIngredients().put("Salt", "20g");
        tomatoEggStirFry.getIngredients().put("Sugar", "15g");
        tomatoEggStirFry.getIngredients().put("Sugar", "15g");
        tomatoEggStirFry.getIngredients().put("Water", "100g");
        tomatoEggStirFry.getIngredients().put("Oil", "35ml");

        StringBuilder steps = new StringBuilder();
        steps.append("1. Slice tomato and spring onion;\n");
        steps.append("2. Mix eggs in a bowl;\n");
        steps.append("3. Put some oil in pan and bing to medium high;\n");
        steps.append("4. Pull the mixed eggs to pan and stir fry;\n");
        steps.append("5. Get the fried eggs back to a bowl;\n");
        steps.append("6. Put slided spring onion and oil in pan;\n");
        steps.append("7. Heat the pan and stir spring onion until flavor comes out;\n");
        steps.append("8. Put the slided tomato to pan and stir fry until it gets melted down;\n");
        steps.append("9. Put fried eggs and mix;\n");
        steps.append("10. Put salt, sugar and water to pan and mix;\n");
        steps.append("11. Cover the pan and bring heat to medium;\n");
        steps.append("12. Let it cook for 8 mins and its ready;\n");

        tomatoEggStirFry.setSteps(steps.toString());

        return tomatoEggStirFry;
    }
}
