package ru.shershnoyv.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import ru.shershnoyv.service.RecipesService;

@AutoConfiguration
public class OpenRecipesAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(RecipesService.class)
    public RecipesService recipesService(WebClient webClient) {
        return new RecipesService(webClient);
    }
}