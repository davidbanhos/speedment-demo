package com.company.speedment_demo.model.model.sakila.film_list.generated;

import com.company.speedment_demo.model.model.sakila.film_list.FilmList;
import com.company.speedment_demo.model.model.sakila.film_list.FilmListImpl;
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
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.company.speedment_demo.model.model.sakila.film_list.FilmList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmListSqlAdapter {
    
    private final TableIdentifier<FilmList> tableIdentifier;
    
    protected GeneratedFilmListSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("model", "sakila", "film_list");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected FilmList apply(ResultSet resultSet) throws SpeedmentException {
        final FilmList entity = createEntity();
        try {
            entity.setFid(         getInt(resultSet, 1)       );
            entity.setTitle(       resultSet.getString(2)     );
            entity.setDescription( resultSet.getString(3)     );
            entity.setCategory(    resultSet.getString(4)     );
            entity.setPrice(       resultSet.getBigDecimal(5) );
            entity.setLength(      getInt(resultSet, 6)       );
            entity.setRating(      resultSet.getString(7)     );
            entity.setActors(      resultSet.getString(8)     );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected FilmListImpl createEntity() {
        return new FilmListImpl();
    }
}