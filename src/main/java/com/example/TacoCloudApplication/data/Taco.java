package com.example.TacoCloudApplication.data;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 1, message = "You must chose at least 1 ingredient")
    @ManyToMany
    private List<Ingredient> ingredients;

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
}
