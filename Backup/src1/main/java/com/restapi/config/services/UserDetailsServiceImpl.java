package com.icicihfc.services.security.services;

import com.icicihfc.services.employee.models.Employee;
import com.icicihfc.services.employee.models.EmployeeType;
import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.security.models.RolePermission;
import com.icicihfc.services.security.repositories.OAuthUserRepository;
import com.icicihfc.services.security.repositories.RolePermissionRepository;
import com.icicihfc.services.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author rajatjain on 15/01/20.
 * @project oauth2boiler
 */
@Slf4j
@Service("userDetailsService")
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private OAuthUserRepository<OAuthUser> userDetailsRepository;

    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<OAuthUser> optionalUser = userDetailsRepository.findByIdentifierAndIsDeactivatedFalse(userName);

        OAuthUser user = optionalUser.orElseThrow(() -> new UsernameNotFoundException(
                "Username or password is incorrect"));
        List<RolePermission> rolePermissions = null;
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
            EmployeeType employeeType = CommonUtils.initializeAndUnproxy(employee.getEmployeeType());
            if (employeeType.isDeactivated()) {
                throw new UsernameNotFoundException("Username or password is incorrect");
            }
            rolePermissions = rolePermissionRepository.findByEmployeeType_Id(employeeType.getId());
        }
        UserDetails userDetails = new AuthUserDetail(user, rolePermissions);
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
