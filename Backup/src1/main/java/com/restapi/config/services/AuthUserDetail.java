package com.icicihfc.services.security.services;

import com.icicihfc.services.customer.models.HfcCustomer;
import com.icicihfc.services.dmarpform.model.DmaRpFormUser;
import com.icicihfc.services.employee.models.Employee;
import com.icicihfc.services.fdportal.applicationform.models.ApplicationFormUser;
import com.icicihfc.services.fdportal.broker.models.BrokerApplicationFormUser;
import com.icicihfc.services.security.constants.Roles;
import com.icicihfc.services.security.enums.PermissionEnum;
import com.icicihfc.services.security.enums.RoleEnum;
import com.icicihfc.services.security.models.OAuthUser;
import com.icicihfc.services.security.models.RolePermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author rajatjain on 15/01/20.
 * @project oauth2boiler
 */
public class AuthUserDetail extends OAuthUser implements UserDetails {

    private List<RolePermission> rolePermissions = null;
    private final OAuthUser oAuthUser;

    public AuthUserDetail(OAuthUser user, List<RolePermission> rolePermissions) {
        super(user);
        this.oAuthUser = user;
        this.rolePermissions = rolePermissions;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        // FOR EMPLOYEES
        if (rolePermissions != null) {
            rolePermissions.forEach(role -> addRolesToGrantedAuthority(grantedAuthorities, role));
        }

        // FOR CUSTOMERS and PARTNERS
        String prefix = Roles.ROLE_PREFIX;
        if (oAuthUser instanceof ApplicationFormUser) {
            String role = prefix + RoleEnum.CUSTOMER_FD.name();
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }else if (oAuthUser instanceof BrokerApplicationFormUser) {
            String role = prefix + RoleEnum.CUSTOMER_BROKER_FD.name();
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }else if (oAuthUser instanceof DmaRpFormUser) {
            String role = prefix + RoleEnum.CUSTOMER_DMA_RP.name();
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }else if (oAuthUser instanceof Employee) {
            String role = prefix + RoleEnum.EMPLOYEE.name();
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }else if (oAuthUser instanceof HfcCustomer) {
            String role = prefix + RoleEnum.HFC_CUSTOMER.name();
            grantedAuthorities.add(new SimpleGrantedAuthority(role));
        }

        return grantedAuthorities;
    }

    private void addRolesToGrantedAuthority(Set<GrantedAuthority> grantedAuthorities, RolePermission role) {
        String prefix = Roles.ROLE_PREFIX + role.getRole() + "_";
        grantedAuthorities.add(new SimpleGrantedAuthority(Roles.ROLE_PREFIX + role.getRole()));
        if (role.isActivate()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(prefix + PermissionEnum.ACTIVATE.name()));
        }
        if (role.isDeactivate()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(prefix + PermissionEnum.DEACTIVATE.name()));
        }
        if (role.isDelete()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(prefix + PermissionEnum.DELETE.name()));
        }
        if (role.isRead()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(prefix + PermissionEnum.READ.name()));
        }
        if (role.isWrite()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(prefix + PermissionEnum.WRITE.name()));
        }
    }

    @Override
    public String getUsername() {
        return this.getIdentifier();
    }

}
