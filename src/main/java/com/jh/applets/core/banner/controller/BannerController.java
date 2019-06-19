package com.jh.applets.core.banner.controller;

import com.jh.applets.common.json.JsonData;
import com.jh.applets.core.banner.service.BannerService;
import com.jh.applets.vo.banner.request.RequestBannerVO;
import com.jh.applets.vo.banner.response.ResponseBannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: applets
 * @description: banner控制器
 * @author: jiahao
 * @create: 2019-06-19 10:56
 **/
@RestController
@RequestMapping("/core/banner")
public class BannerController {

    @Autowired
    BannerService bannerService;

    /**
     * @param requestBannerVO :
     * @description 添加banner
     * @author jia hao
     * @Date 2019/6/19 10:59
     */
    @PostMapping("/add")
    public JsonData add(@RequestBody RequestBannerVO requestBannerVO) {
        bannerService.add(requestBannerVO);
        return JsonData.ok();
    }

    /**
     * @param id :
     * @description 添加banner
     * @author jia hao
     * @Date 2019/6/19 10:59
     */
    @GetMapping("/detail/{id}")
    public JsonData detail(@PathVariable("id") Long id) {
        final ResponseBannerVO detail = bannerService.detail(id);
        return JsonData.ok(detail);
    }
}
