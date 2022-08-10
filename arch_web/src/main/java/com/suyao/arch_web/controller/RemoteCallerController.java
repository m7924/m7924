package com.suyao.arch_web.controller;


import com.suyao.arch_common.api.IHkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 1.使用ribbon
 * @Classname RemoteCallerController
 * @Description TODO
 * @Date 2022/8/2 17:33
 * @Created by B105
 */
@RestController
public class RemoteCallerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String USER_SERVICE_NM = "http://arch-server";

    @GetMapping("/cityVedio")
    public String cityVedio (){
        String name = "tom";
        String url = USER_SERVICE_NM + "/query/cameras/"+name;
        String result = restTemplate.getForObject(url, String.class, name);
        return result;
    }


    @Autowired(required = false)
    private IHkService iHkService;

    @GetMapping("/cityVedio2")
    public String cityVedio2 (){
        String name = "tom";
        String result = iHkService.queryCameras(name);
        return result;
    }
}
