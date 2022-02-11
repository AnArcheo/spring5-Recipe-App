package com.springframework.spring5recipeapp.repositories;

import com.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class) //instead @RunWith(SpringRunner.class)
@DataJpaTest
class UnitOfMeasureRepositoryITTest {
    @Autowired // without this it throws NullPointerException
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() throws Exception{
    }

    @Test
    void findByDescription() throws Exception{

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }

    @Test
    void findByDescriptionCup() throws Exception{

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup", uomOptional.get().getDescription());
    }
}