package ru.shershnoyv.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@Configuration
public class WebClientConfig {
//    @Value("${openrecipes-starter.url}")
//    private String baseUrl;

    @Bean
    @ConditionalOnMissingBean(WebClient.class)
    public WebClient recipesWebClient() {
        return WebClient.builder()
                .baseUrl("http://121.127.37.220:8000")
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}