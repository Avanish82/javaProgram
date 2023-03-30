package com.icicihfc.services.security.models;

import com.icicihfc.services.employee.models.EmployeeType;
import com.icicihfc.services.security.enums.RoleEnum;
import com.icicihfc.services.utils.CommonUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author rajatjain on 10/06/20.
 * @project hfcservices
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(
        uniqueConstraints =
        @UniqueConstraint(columnNames = {"role", "employee_type_id"})
)
@SequenceGenerator(name = "security_seq_gen", sequenceName = "security_seq", allocationSize = 1)
public class RolePermission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "security_seq_gen")
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @Column(name = "is_read")
    private boolean read;

    @Column(name = "is_write")
    private boolean write;

    @Column(name = "is_delete")
    private boolean delete;

    @Column(name = "is_activate")
    private boolean activate;

    @Column(name = "is_deactivate")
    private boolean deactivate;

    @ManyToOne(fetch = FetchType.LAZY)
    private EmployeeType employeeType;

    @CreationTimestamp
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp updatedDate;

    public RolePermission(RoleEnum role, boolean read, boolean write,
                          boolean delete, boolean activate, boolean deactivate,
                          EmployeeType employeeType, Timestamp createdDate,
                          Timestamp updatedDate) {
        this.role = role;
        this.read = read;
        this.write = write;
        this.delete = delete;
        this.activate = activate;
        this.deactivate = deactivate;
        this.employeeType = employeeType;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public static RolePermissionBuilder builder() {
        return new RolePermissionBuilder();
    }

    public static class RolePermissionBuilder {

        private RoleEnum role;

        private boolean read = false;

        private boolean write = false;

        private boolean delete = false;

        private boolean activate = false;

        private boolean deactivate = false;

        private EmployeeType employeeType;

        private Timestamp createdDate = CommonUtils.getCurrentTimeStamp();

        private Timestamp updatedDate = CommonUtils.getCurrentTimeStamp();

        public RolePermissionBuilder withRole(RoleEnum role) {
            this.role = role;
            return this;
        }

        public RolePermissionBuilder withRead(boolean read) {
            this.read = read;
            return this;
        }

        public RolePermissionBuilder withWrite(boolean write) {
            this.write = write;
            return this;
        }

        public RolePermissionBuilder withDelete(boolean delete) {
            this.delete = delete;
            return this;
        }

        public RolePermissionBuilder withActivate(boolean activate) {
            this.activate = activate;
            return this;
        }

        public RolePermissionBuilder withDeactivate(boolean deactivate) {
            this.deactivate = deactivate;
            return this;
        }

        public RolePermissionBuilder withEmployeeType(EmployeeType employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        public RolePermission build() {
            return new RolePermission(role, read, write, delete, activate, deactivate, employeeType, createdDate,
                    updatedDate);
        }
    }
}
