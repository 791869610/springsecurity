package com.jh.applets.core.banner.service.impl;

import com.jh.applets.common.util.bean.BeanUtil;
import com.jh.applets.common.util.id.IdUtil;
import com.jh.applets.core.banner.mapper.BannerMapper;
import com.jh.applets.core.banner.model.Banner;
import com.jh.applets.core.banner.service.BannerService;
import com.jh.applets.vo.banner.request.RequestBannerVO;
import com.jh.applets.vo.banner.response.ResponseBannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: applets
 * @description:
 * @author: jiahao
 * @create: 2019-06-19 10:52
 **/
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerMapper bannerMapper;

    /**
     * @param requestBannerVO :
     * @description 添加
     * @author jia hao
     * @Date 2019/6/19 10:49
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(RequestBannerVO requestBannerVO) {
        final Banner build = Banner.builder()
                .id(IdUtil.generateId())
                .build();
        BeanUtil.copyPropertiesIgnoreNull(requestBannerVO, build);
        bannerMapper.insertSelective(build);
    }

    /**
     * @param id :
     * @description 详情
     * @author jia hao
     * @Date 2019/6/19 10:49
     */
    @Override
    public ResponseBannerVO detail(Long id) {
        return bannerMapper.selectById(id);
    }
}
