package com.company.speedment_demo.model.model.sakila.category.generated;

import com.company.speedment_demo.model.model.sakila.category.Category;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.speedment_demo.model.model.sakila.category.Category} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCategoryManagerImpl 
extends AbstractManager<Category> 
implements GeneratedCategoryManager {
    
    private final TableIdentifier<Category> tableIdentifier;
    
    protected GeneratedCategoryManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("model", "sakila", "category");
    }
    
    @Override
    public TableIdentifier<Category> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Category>> fields() {
        return Stream.of(
            Category.CATEGORY_ID,
            Category.NAME,
            Category.LAST_UPDATE
        );
    }
    
    @Override
    public Stream<Field<Category>> primaryKeyFields() {
        return Stream.of(
            Category.CATEGORY_ID
        );
    }
}