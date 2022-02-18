package com.springframework.spring5recipeapp.converters;

import com.springframework.spring5recipeapp.commands.NotesCommand;
import com.springframework.spring5recipeapp.domain.Notes;
import org.springframework.stereotype.Component;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;



@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if(source == null) {
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(source.getId());
        notes.setNotes(source.getRecipeNotes());
        return notes;
    }
}
