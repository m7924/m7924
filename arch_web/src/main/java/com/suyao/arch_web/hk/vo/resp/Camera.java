package com.suyao.arch_web.hk.vo.resp;

/**
 * @Classname Camera
 * @Description TODO
 * @Date 2022/7/21 15:03
 * @Created by B105
 */
public class Camera {
    private String altitude;//	string	False	海拔
    private String cameraIndexCode;//	string	False	监控点唯一标识
    private String cameraName;//	string	False	监控点名称
    private String cameraType;//	number	False	监控点类型，参考附录A.4
    private String cameraTypeName;//	string	False	监控点类型说明
    private String capabilitySet;//	string	False	设备能力集，参考附录A.22
    private String capabilitySetName;//	string	False	能力集说明
    private String intelligentSet;//	string	False	智能分析能力集，扩展字段，暂不使用
    private String intelligentSetName;//	string	False	智能分析能力集说明，扩展字段，暂不使用
    private String channelNo;//	string	False	通道编号
    private String channelType;//	string	False	通道类型，附录A.5
    private String channelTypeName;//	string	False	通道类型说明
    private String createTime;//	string	False	创建时间，采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2018年7月26日21时30分08秒
    private String encodeDevIndexCode;//	string	False	所属编码设备唯一标识
    private String encodeDevResourceType;//	string	False	所属设备类型，扩展字段，暂不使用
    private String encodeDevResourceTypeName;//	string	False	所属设备类型说明，扩展字段，暂不使用
    private String gbIndexCode;//	string	False	监控点国标编号，即外码编号externalIndexCode
    private String installLocation;//	string	False	安装位置，详见附录附录A.81 安装位置
    private String keyBoardCode;//	string	False	键盘控制码
    private String latitude;//	string	False	纬度
    private String longitude;//	string	False	经度
    private String pixel;//	string	False	摄像机像素（1-普通像素，2-130万高清，3-200万高清，4-300万高清），扩展字段，暂不使用
    private String ptz;//	string	False	云镜类型（1-全方位云台（带转动和变焦），2-只有变焦,不带转动，3-只有转动，不带变焦，4-无云台，无变焦），扩展字段，暂不使用
    private String ptzName;//	string	False	云镜类型说明，扩展字段，暂不使用
    private String ptzController;//	string	False	云台控制(1-DVR，2-模拟矩阵，3-MU4000，4-NC600)，扩展字段，暂不使用
    private String ptzControllerName;//	string	False	云台控制说明，扩展字段，暂不使用
    private String recordLocation;//	string	False	录像存储位置
    private String recordLocationName;//	string	False	录像存储位置说明
    private String regionIndexCode;//	string	False	所属区域唯一标识
    private String status;//	string	False	在线状态（0-未知，1-在线，2-离线），扩展字段，暂不使用
    private String statusName;//	string	False	状态说明
    private Integer transType;//	number	False	传输协议，参考附录A.40  (UDP:0;TCP:1)
    private String transTypeName;//	string	False	传输协议类型说明
    private String treatyType;//	string	False	接入协议，参考附录A.6
    private String treatyTypeName;//	string	False	接入协议类型说明
    private String viewshed;//	string	False	可视域相关（JSON格式），扩展字段，暂不使用
    private String updateTime;//	string	False	更新时间 采用ISO8601标准，如2018-07-26T21:30:08+08:00 表示北京时间2017年7月26日21时30分08秒

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getCameraIndexCode() {
        return cameraIndexCode;
    }

    public void setCameraIndexCode(String cameraIndexCode) {
        this.cameraIndexCode = cameraIndexCode;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getCameraTypeName() {
        return cameraTypeName;
    }

    public void setCameraTypeName(String cameraTypeName) {
        this.cameraTypeName = cameraTypeName;
    }

    public String getCapabilitySet() {
        return capabilitySet;
    }

    public void setCapabilitySet(String capabilitySet) {
        this.capabilitySet = capabilitySet;
    }

    public String getCapabilitySetName() {
        return capabilitySetName;
    }

    public void setCapabilitySetName(String capabilitySetName) {
        this.capabilitySetName = capabilitySetName;
    }

    public String getIntelligentSet() {
        return intelligentSet;
    }

    public void setIntelligentSet(String intelligentSet) {
        this.intelligentSet = intelligentSet;
    }

    public String getIntelligentSetName() {
        return intelligentSetName;
    }

    public void setIntelligentSetName(String intelligentSetName) {
        this.intelligentSetName = intelligentSetName;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelTypeName() {
        return channelTypeName;
    }

    public void setChannelTypeName(String channelTypeName) {
        this.channelTypeName = channelTypeName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEncodeDevIndexCode() {
        return encodeDevIndexCode;
    }

    public void setEncodeDevIndexCode(String encodeDevIndexCode) {
        this.encodeDevIndexCode = encodeDevIndexCode;
    }

    public String getEncodeDevResourceType() {
        return encodeDevResourceType;
    }

    public void setEncodeDevResourceType(String encodeDevResourceType) {
        this.encodeDevResourceType = encodeDevResourceType;
    }

    public String getEncodeDevResourceTypeName() {
        return encodeDevResourceTypeName;
    }

    public void setEncodeDevResourceTypeName(String encodeDevResourceTypeName) {
        this.encodeDevResourceTypeName = encodeDevResourceTypeName;
    }

    public String getGbIndexCode() {
        return gbIndexCode;
    }

    public void setGbIndexCode(String gbIndexCode) {
        this.gbIndexCode = gbIndexCode;
    }

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }

    public String getKeyBoardCode() {
        return keyBoardCode;
    }

    public void setKeyBoardCode(String keyBoardCode) {
        this.keyBoardCode = keyBoardCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public String getPtz() {
        return ptz;
    }

    public void setPtz(String ptz) {
        this.ptz = ptz;
    }

    public String getPtzName() {
        return ptzName;
    }

    public void setPtzName(String ptzName) {
        this.ptzName = ptzName;
    }

    public String getPtzController() {
        return ptzController;
    }

    public void setPtzController(String ptzController) {
        this.ptzController = ptzController;
    }

    public String getPtzControllerName() {
        return ptzControllerName;
    }

    public void setPtzControllerName(String ptzControllerName) {
        this.ptzControllerName = ptzControllerName;
    }

    public String getRecordLocation() {
        return recordLocation;
    }

    public void setRecordLocation(String recordLocation) {
        this.recordLocation = recordLocation;
    }

    public String getRecordLocationName() {
        return recordLocationName;
    }

    public void setRecordLocationName(String recordLocationName) {
        this.recordLocationName = recordLocationName;
    }

    public String getRegionIndexCode() {
        return regionIndexCode;
    }

    public void setRegionIndexCode(String regionIndexCode) {
        this.regionIndexCode = regionIndexCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public String getTransTypeName() {
        return transTypeName;
    }

    public void setTransTypeName(String transTypeName) {
        this.transTypeName = transTypeName;
    }

    public String getTreatyType() {
        return treatyType;
    }

    public void setTreatyType(String treatyType) {
        this.treatyType = treatyType;
    }

    public String getTreatyTypeName() {
        return treatyTypeName;
    }

    public void setTreatyTypeName(String treatyTypeName) {
        this.treatyTypeName = treatyTypeName;
    }

    public String getViewshed() {
        return viewshed;
    }

    public void setViewshed(String viewshed) {
        this.viewshed = viewshed;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
