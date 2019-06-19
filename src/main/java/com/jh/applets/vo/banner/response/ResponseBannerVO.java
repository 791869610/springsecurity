package com.jh.applets.vo.banner.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseBannerVO {
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
}