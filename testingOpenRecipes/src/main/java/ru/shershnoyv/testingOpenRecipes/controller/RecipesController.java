package ru.shershnoyv.testingOpenRecipes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.shershnoyv.dto.RecipeDto;
import ru.shershnoyv.service.RecipesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recipes")
public class RecipesController {

    private final RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @GetMapping()
    public Mono<List<RecipeDto>> getRecipes() {
        return recipesService.getAllRecipesAsList(20);
    }
}
