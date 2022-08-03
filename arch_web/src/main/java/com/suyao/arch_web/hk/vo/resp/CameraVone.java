package com.suyao.arch_web.hk.vo.resp;


import java.math.BigDecimal;

/**
 * @Classname CameraVone
 * @Description TODO
 * @Date 2022/7/27 15:30
 * @Created by B105
 */
public class CameraVone {
    private String indexCode;//	string	False	唯一编码
    private String resourceType;//	string	False	资源类型，camera：监控点
    private String externalIndexCode;//	string	False	监控点国标编号
    private String name;//	string	False	资源名称
    private Integer chanNum;//	number	False	通道号，为级联监控点时，该字段为空； 本级监控点时，该字段非空
    private String cascadeCode;//	string	False	级联编号
    private String parentIndexCode;//	string	False	父级资源编号
    private BigDecimal longitude;//	number	False	经度，精确到小数点后8位
    private String latitude;//	number	False	纬度，精确到小数点后8位
    private String elevation;//	string	False	海拔高度，单位：米
    private Integer cameraType;//	number	False	监控点类型 枪机0 半球1 快球2 带云台枪机3
    private String capability;//	string	False	能力集，详见附录A.44 设备能力集
    private String recordLocation;//	string	False	录像存储位置
    private String channelType;//	string	False	通道子类型， 模拟通道analog 数字通道digital 镜像通道mirror 录播通道record 零通道zero
    private String regionIndexCode;//	string	False	所属区域
    private String regionPath;//	string	False	所属区域路径,以@符号分割，包含本节点
    private Integer transType;//	number	False	传输协议，  0：UDP 1：TCP
    private String treatyType;//	string	False	接入协议，详见附录A.6 编码设备接入协议
    private String installLocation;//	string	False	安装位置，详见附录附录A.81 安装位置
    private String createTime;//	string	False	创建时间，IOS8601格式，参考附录B ISO8601时间格式说明
    private String updateTime;//	string	False	更新时间，IOS8601格式，参考附录B ISO8601时间格式说明
    private Integer disOrder;//	number	False	数据在界面上的显示顺序
    private String resourceIndexCode;//	string	False	资源唯一编码
    private String decodeTag;//	string	False	解码模式
    private String cameraRelateTalk;//	string	False	监控点关联对讲唯一标志
    private String regionName;//	string	False	所属区域路径，由唯一标示组成，最大10级，格式： @根节点@子区域1@子区域2@
    private String regionPathName;//	string	False	区域路径名称，"/"分隔

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getExternalIndexCode() {
        return externalIndexCode;
    }

    public void setExternalIndexCode(String externalIndexCode) {
        this.externalIndexCode = externalIndexCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChanNum() {
        return chanNum;
    }

    public void setChanNum(Integer chanNum) {
        this.chanNum = chanNum;
    }

    public String getCascadeCode() {
        return cascadeCode;
    }

    public void setCascadeCode(String cascadeCode) {
        this.cascadeCode = cascadeCode;
    }

    public String getParentIndexCode() {
        return parentIndexCode;
    }

    public void setParentIndexCode(String parentIndexCode) {
        this.parentIndexCode = parentIndexCode;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public Integer getCameraType() {
        return cameraType;
    }

    public void setCameraType(Integer cameraType) {
        this.cameraType = cameraType;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public String getRecordLocation() {
        return recordLocation;
    }

    public void setRecordLocation(String recordLocation) {
        this.recordLocation = recordLocation;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getRegionIndexCode() {
        return regionIndexCode;
    }

    public void setRegionIndexCode(String regionIndexCode) {
        this.regionIndexCode = regionIndexCode;
    }

    public String getRegionPath() {
        return regionPath;
    }

    public void setRegionPath(String regionPath) {
        this.regionPath = regionPath;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public String getTreatyType() {
        return treatyType;
    }

    public void setTreatyType(String treatyType) {
        this.treatyType = treatyType;
    }

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDisOrder() {
        return disOrder;
    }

    public void setDisOrder(Integer disOrder) {
        this.disOrder = disOrder;
    }

    public String getResourceIndexCode() {
        return resourceIndexCode;
    }

    public void setResourceIndexCode(String resourceIndexCode) {
        this.resourceIndexCode = resourceIndexCode;
    }

    public String getDecodeTag() {
        return decodeTag;
    }

    public void setDecodeTag(String decodeTag) {
        this.decodeTag = decodeTag;
    }

    public String getCameraRelateTalk() {
        return cameraRelateTalk;
    }

    public void setCameraRelateTalk(String cameraRelateTalk) {
        this.cameraRelateTalk = cameraRelateTalk;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionPathName() {
        return regionPathName;
    }

    public void setRegionPathName(String regionPathName) {
        this.regionPathName = regionPathName;
    }
}
