package ru.shershnoyv.service;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.shershnoyv.dto.RecipeDto;

import java.util.List;

public class RecipesService {

    private final WebClient webClient;

    public RecipesService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<RecipeDto> getAllRecipes(int limit) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/recipes/all")
                        .queryParam("limit", limit)
                        .build())
                .retrieve()
                .bodyToFlux(RecipeDto.class);
    }

    public Mono<List<RecipeDto>> getAllRecipesAsList(int limit) {
        return getAllRecipes(limit).collectList();
    }
}
