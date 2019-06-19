package com.jh.applets.vo.banner.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestBannerVO {
    /**
     * banner id
     */
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
    private Long typeId;

    /**
     * 类型(1按分类，2所有)
     */
    private Integer linkType;

    /**
     * 所属分类/标签id
     */
    private Long lingTypeId;

    /**
     * 文章链接id
     */
    private Long linkId;

    /**
     * 是否删除,1删除,2未删除
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 预留字段
     */
    private String reserved;
}