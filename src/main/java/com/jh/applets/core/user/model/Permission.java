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
@Table(name = "sys_permission")
public class Permission {
    /**
     * id
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限描述
     */
    private String desc;

    /**
     * 权限路径
     */
    private String url;

    /**
     * 父级id
     */
    @Column(name = "p_id")
    private Long pId;
}