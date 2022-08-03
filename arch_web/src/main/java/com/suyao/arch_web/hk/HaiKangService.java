package com.suyao.arch_web.hk;

import com.alibaba.fastjson.JSONObject;
import com.suyao.arch_web.hk.vo.BaseResult;
import com.suyao.arch_web.hk.vo.HaiKangConfig;
import com.suyao.arch_web.hk.vo.req.DeviceSearch;
import com.suyao.arch_web.hk.vo.resp.Camera;
import com.suyao.arch_web.hk.vo.resp.CameraVone;
import com.suyao.arch_web.hk.vo.resp.Device;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Classname HaiKangService
 * @Description TODO
 * @Date 2022/7/21 9:24
 * @Created by B105
 */
public class HaiKangService {
    private static final Logger logger = LoggerFactory.getLogger(HaiKangService.class);
    /**
     * STEP0：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
     */
    static {
        ArtemisConfig.host = "124.72.50.186:8090"; // 平台的ip端口
        ArtemisConfig.appKey = "26568031";  // 密钥appkey
        ArtemisConfig.appSecret = "YN3GkzwZkNdzu9igHrk1";// 密钥appSecret

    }

    /*
     * 设置OpenAPI接口的上下文
     */
    static final String ARTEMIS_PATH = "/artemis";

    /*
     * 设置参数提交方式
     */
    static final String contentType = "application/json";


    /**
     * 查询编码设备列表v2
     * @param ds
     * @return
     */
    public static BaseResult deviceSearch(DeviceSearch ds) {
        try{
            /*
             * STEP1：设置接口的URI地址
             */
            final String previewURLsApi = ARTEMIS_PATH + HaiKangConfig.DEVICE_SEARCH_URI;
            /*
             * HashMap(int initialCapacity, float loadFactor)//initialCapacity - 初始容量  loadFactor - 默认加载因子
             * 通过查看 HashMap 的源码可以得知其默认的初始容量为 16，默认的加载因子为 0.75
             * 容量要求必须是2的N次幂，这样可以提高散列的均匀性，降低 Hash 冲突的风险。
             * 加载因子越高，空间利用率提高了，但是查询时间和添加时间增加
             * */
            Map<String, String> path = new HashMap<String, String>(2) {
                {
                    put("http://", previewURLsApi);//根据现场环境部署确认是http还是https
                }
            };
            /*
             * STEP2：组装请求参数
             */
            String body = JSONObject.toJSONString(ds);
            /*
             * STEP3：调用接口
             * accept 请求头属性，作用：希望服务器返回的数据类型
             */
            String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
            logger.info("deviceSearch结果:" + result);
            JSONObject json = JSONObject.parseObject(result);
            if("0".equals(String.valueOf(json.get("code")))){
                String dataString = json.getString("data");
                List<Device> datas = JSONObject.parseArray(JSONObject.parseObject(dataString).getString("list"), Device.class);
                return new BaseResult(BaseResult.SUCCESS_CODE, "", datas);
            }else {
                return new BaseResult(BaseResult.FAIL_CODE, json.getString("msg"));
            }
        }catch (Exception e){
            logger.error("deviceSearch接口请求失败", e);
            return new BaseResult(BaseResult.FAIL_CODE, e.getMessage());
        }
    }


    /**
     * 分页获取监控点资源
     * @param ds
     * @return
     */
    public static BaseResult queryCameras(DeviceSearch ds) {
        try{
            final String previewURLsApi = ARTEMIS_PATH + HaiKangConfig.CAMERAS_URI;
            Map<String, String> path = new HashMap<String, String>(2) {
                {
                    put("http://", previewURLsApi);//根据现场环境部署确认是http还是https
                }
            };
            String body = JSONObject.toJSONString(ds);
            //doPostStringArtemis()方法内部实现了登入认证逻辑
            String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
            logger.info("queryCameras结果:" + result);
            JSONObject json = JSONObject.parseObject(result);
            if("0".equals(String.valueOf(json.get("code")))){
                String dataString = json.getString("data");
                List<Camera> datas = JSONObject.parseArray(JSONObject.parseObject(dataString).getString("list"), Camera.class);
                return new BaseResult(BaseResult.SUCCESS_CODE, "", datas);
            }else {
                return new BaseResult(BaseResult.FAIL_CODE, json.getString("msg"));
            }
        }catch (Exception e){
            logger.error("queryCameras接口请求失败", e);
            return new BaseResult(BaseResult.FAIL_CODE, e.getMessage());
        }

    }

    /**
     * 查询监控点列表v2
     * @param ds
     * @return
     */
    public static BaseResult searchCameras(DeviceSearch ds) {
        try{
            final String previewURLsApi = ARTEMIS_PATH + HaiKangConfig.CAMERA_SEARCH_URI;
            Map<String, String> path = new HashMap<String, String>(2) {
                {
                    put("http://", previewURLsApi);//根据现场环境部署确认是http还是https
                }
            };
            String body = JSONObject.toJSONString(ds);
            //doPostStringArtemis()方法内部实现了登入认证逻辑
            String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
            logger.info("queryCameras结果:" + result);
            JSONObject json = JSONObject.parseObject(result);
            if("0".equals(String.valueOf(json.get("code")))){
                String dataString = json.getString("data");
                List<CameraVone> datas = JSONObject.parseArray(JSONObject.parseObject(dataString).getString("list"), CameraVone.class);
                return new BaseResult(BaseResult.SUCCESS_CODE, "", datas);
            }else {
                return new BaseResult(BaseResult.FAIL_CODE, json.getString("msg"));
            }
        }catch (Exception e){
            logger.error("queryCameras接口请求失败", e);
            return new BaseResult(BaseResult.FAIL_CODE, e.getMessage());
        }

    }

    public static void main(String[] args) {
        BaseResult result = HaiKangService.searchCameras(new DeviceSearch(1,200));
        System.out.println("result结果示例: " + JSONObject.toJSONString(result));
    }
}
