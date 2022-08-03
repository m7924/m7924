package com.suyao.arch_server.controller;

import com.alibaba.fastjson.JSONObject;
import com.suyao.arch_server.service3h.HaiKangService;
import com.suyao.arch_server.service3h.vo.BaseResult;
import com.suyao.arch_server.service3h.vo.req.DeviceSearch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HkServerController
 * @Description TODO
 * @Date 2022/8/2 16:47
 * @Created by B105
 */
@Slf4j
@RestController
public class HkServerController {

    @GetMapping("/query/cameras/{name}")
    public String queryCameras(@PathVariable("name") String name){
        BaseResult result = HaiKangService.queryCameras(new DeviceSearch(1,200));
        log.info("Hi {}", "TOM");
        return JSONObject.toJSONString(result);
    }
}
