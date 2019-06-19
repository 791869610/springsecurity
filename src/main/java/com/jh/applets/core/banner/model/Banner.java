package com.jh.applets.core.banner.model;

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
@Table(name = "bus_banner")
public class Banner {
    /**
     * banner id
     */
    @Id
    private Long id;

    /**
     * banner地址
     */
    private String url;

    /**
     * banner标题
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 类型(1首页，2导航，3底部导航)
     */
    private Integer type;

    /**
     * 所属分类/标签id
     */
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 类型(1按分类，2所有)
     */
    @Column(name = "link_type")
    private Integer linkType;

    /**
     * 所属分类/标签id
     */
    @Column(name = "ling_type_id")
    private Long lingTypeId;

    /**
     * 文章链接id
     */
    @Column(name = "link_id")
    private Long linkId;

    /**
     * 是否删除,1删除,2未删除
     */
    @Column(name = "is_del")
    private Integer isDel;

    /**
     * 创建时间
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