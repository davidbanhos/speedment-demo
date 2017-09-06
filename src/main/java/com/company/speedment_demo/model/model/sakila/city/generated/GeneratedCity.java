package com.company.speedment_demo.model.model.sakila.city.generated;

import com.company.speedment_demo.model.model.sakila.city.City;
import com.company.speedment_demo.model.model.sakila.country.Country;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.company.speedment_demo.model.model.sakila.city.City}-interface
 * representing entities of the {@code city}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCity {
    
    /**
     * This Field corresponds to the {@link City} field that can be obtained
     * using the {@link City#getCityId()} method.
     */
    IntField<City, Integer> CITY_ID = IntField.create(
        Identifier.CITY_ID,
        City::getCityId,
        City::setCityId,
        TypeMapper.primitive(), 
        true
    );
    /**
     * This Field corresponds to the {@link City} field that can be obtained
     * using the {@link City#getCity()} method.
     */
    StringField<City, String> CITY = StringField.create(
        Identifier.CITY,
        City::getCity,
        City::setCity,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link City} field that can be obtained
     * using the {@link City#getCountryId()} method.
     */
    IntForeignKeyField<City, Integer, Country> COUNTRY_ID = IntForeignKeyField.create(
        Identifier.COUNTRY_ID,
        City::getCountryId,
        City::setCountryId,
        Country.COUNTRY_ID,
        TypeMapper.primitive(), 
        false
    );
    /**
     * This Field corresponds to the {@link City} field that can be obtained
     * using the {@link City#getLastUpdate()} method.
     */
    ComparableField<City, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        City::getLastUpdate,
        City::setLastUpdate,
        TypeMapper.identity(), 
        false
    );
    
    /**
     * Returns the cityId of this City. The cityId field corresponds to the
     * database column model.sakila.city.city_id.
     * 
     * @return the cityId of this City
     */
    int getCityId();
    
    /**
     * Returns the city of this City. The city field corresponds to the database
     * column model.sakila.city.city.
     * 
     * @return the city of this City
     */
    String getCity();
    
    /**
     * Returns the countryId of this City. The countryId field corresponds to
     * the database column model.sakila.city.country_id.
     * 
     * @return the countryId of this City
     */
    int getCountryId();
    
    /**
     * Returns the lastUpdate of this City. The lastUpdate field corresponds to
     * the database column model.sakila.city.last_update.
     * 
     * @return the lastUpdate of this City
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the cityId of this City. The cityId field corresponds to the
     * database column model.sakila.city.city_id.
     * 
     * @param cityId to set of this City
     * @return       this City instance
     */
    City setCityId(int cityId);
    
    /**
     * Sets the city of this City. The city field corresponds to the database
     * column model.sakila.city.city.
     * 
     * @param city to set of this City
     * @return     this City instance
     */
    City setCity(String city);
    
    /**
     * Sets the countryId of this City. The countryId field corresponds to the
     * database column model.sakila.city.country_id.
     * 
     * @param countryId to set of this City
     * @return          this City instance
     */
    City setCountryId(int countryId);
    
    /**
     * Sets the lastUpdate of this City. The lastUpdate field corresponds to the
     * database column model.sakila.city.last_update.
     * 
     * @param lastUpdate to set of this City
     * @return           this City instance
     */
    City setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Country. If no such
     * Country exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Country findCountryId(Manager<Country> foreignManager);
    
    enum Identifier implements ColumnIdentifier<City> {
        
        CITY_ID     ("city_id"),
        CITY        ("city"),
        COUNTRY_ID  ("country_id"),
        LAST_UPDATE ("last_update");
        
        private final String columnName;
        private final TableIdentifier<City> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "model";
        }
        
        @Override
        public String getSchemaName() {
            return "sakila";
        }
        
        @Override
        public String getTableName() {
            return "city";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<City> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}