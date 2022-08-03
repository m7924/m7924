package com.suyao.arch_server.service3h.vo.resp;

/**
 * @Classname Device
 * @Description TODO
 * @Date 2022/7/21 14:15
 * @Created by B105
 */
public class Device extends Base{
    private String belongIndexCode;//所属服务编号
    private String capability;//	string	False	能力集，详见附录A.44 设备能力集中的编码设备能力集
    private String deviceKey;//	string	False	设备驱动
    private String deviceType;//	string	False	设备系列
    private String devSerialNum;//	string	False	设备序列号
    private String deviceCode;//	string	False	主动设备编号
    private String indexCode;//	string	False	资源唯一编码
    private String manufacturer;//	string	False	厂商
    private String name;//	string	False	资源名称
    private String regionIndexCode;//	string	False	所属区域
    private String regionPath;//	string	False	所属区域路径，由唯一标示组成，最大10级，格式： @根节点@子区域1@子区域2@
    private String resourceType;//	string	False	资源类型，encodeDevice：编码设备
    private String treatyType;//	string	False	接入协议，详见附录A.6 编码设备接入协议
    private String createTime;//	string	False	创建时间，IOS8601格式，参考附录B ISO8601时间格式说明
    private String updateTime;//	string	False	更新时间，IOS8601格式，参考附录B ISO8601时间格式说明

    public String getBelongIndexCode() {
        return belongIndexCode;
    }

    public void setBelongIndexCode(String belongIndexCode) {
        this.belongIndexCode = belongIndexCode;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDevSerialNum() {
        return devSerialNum;
    }

    public void setDevSerialNum(String devSerialNum) {
        this.devSerialNum = devSerialNum;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getTreatyType() {
        return treatyType;
    }

    public void setTreatyType(String treatyType) {
        this.treatyType = treatyType;
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
}
