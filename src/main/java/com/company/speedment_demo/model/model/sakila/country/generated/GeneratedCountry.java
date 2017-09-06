package com.company.speedment_demo.model.model.sakila.country.generated;

import com.company.speedment_demo.model.model.sakila.country.Country;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.company.speedment_demo.model.model.sakila.country.Country}-interface
 * representing entities of the {@code country}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCountry {
    
    /**
     * This Field corresponds to the {@link Country} field that can be obtained
     * using the {@link Country#getCountryId()} method.
     */
    IntField<Country, Integer> COUNTRY_ID = IntField.create(
        Identifier.COUNTRY_ID,
        Country::getCountryId,
        Country::setCountryId,
        TypeMapper.primitive(), 
        true
    );
    /**
     * This Field corresponds to the {@link Country} field that can be obtained
     * using the {@link Country#getCountry()} method.
     */
    StringField<Country, String> COUNTRY = StringField.create(
        Identifier.COUNTRY,
        Country::getCountry,
        Country::setCountry,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Country} field that can be obtained
     * using the {@link Country#getLastUpdate()} method.
     */
    ComparableField<Country, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Country::getLastUpdate,
        Country::setLastUpdate,
        TypeMapper.identity(), 
        false
    );
    
    /**
     * Returns the countryId of this Country. The countryId field corresponds to
     * the database column model.sakila.country.country_id.
     * 
     * @return the countryId of this Country
     */
    int getCountryId();
    
    /**
     * Returns the country of this Country. The country field corresponds to the
     * database column model.sakila.country.country.
     * 
     * @return the country of this Country
     */
    String getCountry();
    
    /**
     * Returns the lastUpdate of this Country. The lastUpdate field corresponds
     * to the database column model.sakila.country.last_update.
     * 
     * @return the lastUpdate of this Country
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the countryId of this Country. The countryId field corresponds to
     * the database column model.sakila.country.country_id.
     * 
     * @param countryId to set of this Country
     * @return          this Country instance
     */
    Country setCountryId(int countryId);
    
    /**
     * Sets the country of this Country. The country field corresponds to the
     * database column model.sakila.country.country.
     * 
     * @param country to set of this Country
     * @return        this Country instance
     */
    Country setCountry(String country);
    
    /**
     * Sets the lastUpdate of this Country. The lastUpdate field corresponds to
     * the database column model.sakila.country.last_update.
     * 
     * @param lastUpdate to set of this Country
     * @return           this Country instance
     */
    Country setLastUpdate(Timestamp lastUpdate);
    
    enum Identifier implements ColumnIdentifier<Country> {
        
        COUNTRY_ID  ("country_id"),
        COUNTRY     ("country"),
        LAST_UPDATE ("last_update");
        
        private final String columnName;
        private final TableIdentifier<Country> tableIdentifier;
        
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
            return "country";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Country> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}