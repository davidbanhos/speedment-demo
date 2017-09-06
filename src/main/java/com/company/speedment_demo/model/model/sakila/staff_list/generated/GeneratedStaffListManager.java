package com.company.speedment_demo.model.model.sakila.staff_list.generated;

import com.company.speedment_demo.model.model.sakila.staff_list.StaffList;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.speedment_demo.model.model.sakila.staff_list.StaffList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStaffListManager extends Manager<StaffList> {
    
    @Override
    default Class<StaffList> getEntityClass() {
        return StaffList.class;
    }
}