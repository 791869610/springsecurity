package com.jh.applets.core.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sys_user")
public class User {
    /**
     * id
     */
    private Long id;

    /**
     * 帐号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 使用者
     */
    private String name;

    /**
     * 是否删除,1删除,2未删除
     */
    @Column(name = "is_del")
    private Integer isDel;

    /**
     * 创建时间/评论时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 预留字段
     */
    private String reserved;
}