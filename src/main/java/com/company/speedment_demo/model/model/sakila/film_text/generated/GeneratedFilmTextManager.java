package com.company.speedment_demo.model.model.sakila.film_text.generated;

import com.company.speedment_demo.model.model.sakila.film_text.FilmText;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.speedment_demo.model.model.sakila.film_text.FilmText} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmTextManager extends Manager<FilmText> {
    
    @Override
    default Class<FilmText> getEntityClass() {
        return FilmText.class;
    }
}