package com.suyao.arch_server.service3h.vo;

/**
 * @Classname HaiKangConfig
 * @Description TODO
 * @Date 2022/7/21 9:22
 * @Created by B105
 */
public interface HaiKangConfig {
    //查询编码设备列表v2
    String DEVICE_SEARCH_URI = "/api/resource/v2/encodeDevice/search";

    //分页获取监控点资源
    String CAMERAS_URI = "/api/resource/v1/cameras";

    //查询监控点列表v2
    String CAMERA_SEARCH_URI = "/api/resource/v2/camera/search";
}
