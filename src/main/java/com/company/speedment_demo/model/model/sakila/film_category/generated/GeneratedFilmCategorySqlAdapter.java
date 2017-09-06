package com.company.speedment_demo.model.model.sakila.film_category.generated;

import com.company.speedment_demo.model.model.sakila.film_category.FilmCategory;
import com.company.speedment_demo.model.model.sakila.film_category.FilmCategoryImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.speedment_demo.model.model.sakila.film_category.FilmCategory}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmCategorySqlAdapter {
    
    private final TableIdentifier<FilmCategory> tableIdentifier;
    
    protected GeneratedFilmCategorySqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("model", "sakila", "film_category");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected FilmCategory apply(ResultSet resultSet) throws SpeedmentException {
        final FilmCategory entity = createEntity();
        try {
            entity.setFilmId(     resultSet.getInt(1)       );
            entity.setCategoryId( resultSet.getShort(2)     );
            entity.setLastUpdate( resultSet.getTimestamp(3) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected FilmCategoryImpl createEntity() {
        return new FilmCategoryImpl();
    }
}