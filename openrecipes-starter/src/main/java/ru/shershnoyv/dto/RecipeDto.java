package ru.shershnoyv.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class RecipeDto {
    private Integer id;
    private String title;

    @JsonProperty("category_name")
    private String categoryName;

    @JsonProperty("cuisine_name")
    private String cuisineName;

    private String poster;
    private String difficulty;
    private String cooktime;
    private Boolean vegan;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("match_count")
    private Integer matchCount;

    @JsonProperty("matched_ingredients")
    private List<String> matchedIngredients;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCooktime() {
        return cooktime;
    }

    public void setCooktime(String cooktime) {
        this.cooktime = cooktime;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
    }

    public List<String> getMatchedIngredients() {
        return matchedIngredients;
    }

    public void setMatchedIngredients(List<String> matchedIngredients) {
        this.matchedIngredients = matchedIngredients;
    }
}