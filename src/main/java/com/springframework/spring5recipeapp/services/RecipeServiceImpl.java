package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.domain.Recipe;
import com.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
//    private final RecipeCommandToRecipe recipeCommandToRecipe;
//    private final RecipeToRecipeCommand recipeToRecipeCommand;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
//        this.recipeCommandToRecipe = recipeCommandToRecipe;
//        this.recipeToRecipeCommand = recipeToRecipeCommand;
    }

    @Override
    public Set<Recipe> getRecipes() {
//        log.debug("I'm in the service");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {

        Optional<Recipe> recipeOptional = recipeRepository.findById(l);

//        if (!recipeOptional.isPresent()) {
//            throw new ChangeSetPersister.NotFoundException("Recipe Not Found. For ID value: " + l.toString());
//        }

        return recipeOptional.get();
    }

//    @Override
//    @Transactional
//    public RecipeCommand findCommandById(Long l) {
//        return recipeToRecipeCommand.convert(findById(l));
//    }
//
//    @Override
//    @Transactional
//    public RecipeCommand saveRecipeCommand(RecipeCommand command) {
//        Recipe detachedRecipe = recipeCommandToRecipe.convert(command);
//
//        Recipe savedRecipe = recipeRepository.save(detachedRecipe);
//        log.debug("Saved RecipeId:" + savedRecipe.getId());
//        return recipeToRecipeCommand.convert(savedRecipe);
//    }

    @Override
    public void deleteById(Long idToDelete) {
        recipeRepository.deleteById(idToDelete);
    }
}
