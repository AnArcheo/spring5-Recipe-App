package com.springframework.spring5recipeapp.contollers;

import com.springframework.spring5recipeapp.repositories.RecipeRepository;
import com.springframework.spring5recipeapp.services.RecipeService;
import com.springframework.spring5recipeapp.services.RecipeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class IndexControllerTest {

    RecipeRepository repository;

    @Mock
    RecipeService recipeService;

    @BeforeEach
    void setUp() {
        recipeService = new RecipeServiceImpl(repository);
    }

    @Test
    void getIndexPage() {
    }
}