package com.jh.applets.core.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sys_permission_role")
public class PermissionRole {
    /**
     * id
     */
    private Long id;

    /**
     * 权限id
     */
    @Column(name = "per_id")
    private Long perId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;
}