package com.jh.applets.core.banner.mapper;

import com.jh.applets.config.mapper.MyBaseMapper;
import com.jh.applets.core.banner.model.Banner;
import com.jh.applets.vo.banner.response.ResponseBannerVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BannerMapper extends MyBaseMapper<Banner> {
    /**
     * @param id :
     * @description 根据id获取数据
     * @author  jia hao
     * @Date  2019/6/19 12:03
     */
    ResponseBannerVO selectById(@Param("id") Long id);
}