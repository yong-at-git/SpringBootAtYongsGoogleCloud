package se.yong.cloud.controllers.cooking;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Yong Huang <yong.e.huang@gmail.com> on 2017-11-12.
 */
@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @RequestMapping("/names")
    public List<String> getRecipeNames() {
        return Stream.of(RecipeName.CHINESE_TOMATO_EGG_STIR_FRY.name()).collect(Collectors.toList());
    }

    @RequestMapping("/{name}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable(value = "name") RecipeName name) {

        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);

        Recipe recipe = RecipeProducer.getRecipe(name).orElse(null);
        if (recipe != null) {
            responseEntity = new ResponseEntity(recipe, HttpStatus.OK);
        }

        return responseEntity;
    }
}
