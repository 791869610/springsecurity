package com.jh.applets.core.banner.service;

import com.jh.applets.vo.banner.request.RequestBannerVO;
import com.jh.applets.vo.banner.response.ResponseBannerVO;

/**
  * @Description: banner设置
  * @author: jiahao
  * @Date: 2019/6/19 10:48
  */
public interface BannerService {
    /**
     * @param requestBannerVO :
     * @description 添加
     * @author  jia hao
     * @Date  2019/6/19 10:49
     */
    void add(RequestBannerVO requestBannerVO);

    /**
     * @param id :
     * @description 详情
     * @author  jia hao
     * @Date  2019/6/19 10:49
     */
    ResponseBannerVO detail(Long id);
}
