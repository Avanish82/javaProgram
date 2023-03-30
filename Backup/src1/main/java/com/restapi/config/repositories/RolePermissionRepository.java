package com.icicihfc.services.security.repositories;

import com.icicihfc.services.security.enums.RoleEnum;
import com.icicihfc.services.security.models.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {

    RolePermission findByRoleAndEmployeeType_Id(RoleEnum role, Integer employeeTypeId);

    List<RolePermission> findByEmployeeType_Id(Integer employeeTypeId);

}
