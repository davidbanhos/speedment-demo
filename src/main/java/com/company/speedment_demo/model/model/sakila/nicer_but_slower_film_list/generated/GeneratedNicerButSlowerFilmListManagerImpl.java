package com.company.speedment_demo.model.model.sakila.nicer_but_slower_film_list.generated;

import com.company.speedment_demo.model.model.sakila.nicer_but_slower_film_list.NicerButSlowerFilmList;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractViewManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.speedment_demo.model.model.sakila.nicer_but_slower_film_list.NicerButSlowerFilmList}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedNicerButSlowerFilmListManagerImpl 
extends AbstractViewManager<NicerButSlowerFilmList> 
implements GeneratedNicerButSlowerFilmListManager {
    
    private final TableIdentifier<NicerButSlowerFilmList> tableIdentifier;
    
    protected GeneratedNicerButSlowerFilmListManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("model", "sakila", "nicer_but_slower_film_list");
    }
    
    @Override
    public TableIdentifier<NicerButSlowerFilmList> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<NicerButSlowerFilmList>> fields() {
        return Stream.of(
            NicerButSlowerFilmList.FID,
            NicerButSlowerFilmList.TITLE,
            NicerButSlowerFilmList.DESCRIPTION,
            NicerButSlowerFilmList.CATEGORY,
            NicerButSlowerFilmList.PRICE,
            NicerButSlowerFilmList.LENGTH,
            NicerButSlowerFilmList.RATING,
            NicerButSlowerFilmList.ACTORS
        );
    }
    
    @Override
    public Stream<Field<NicerButSlowerFilmList>> primaryKeyFields() {
        return Stream.empty();
    }
}