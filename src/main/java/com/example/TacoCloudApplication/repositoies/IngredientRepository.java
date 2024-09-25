package com.example.TacoCloudApplication.repositoies;

import com.example.TacoCloudApplication.data.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
