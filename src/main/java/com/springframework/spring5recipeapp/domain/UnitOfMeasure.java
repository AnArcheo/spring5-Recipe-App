package com.springframework.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;

    @OneToOne
    private Ingredient ingredient;

}
