package com.example.reciperecommendationservice.repository;

import com.example.reciperecommendationservice.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}

