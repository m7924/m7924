package com.suyao.arch_web.hk.vo;

/**
 * @Classname InitVedioIndex
 * @Description TODO
 * @Date 2022/7/29 11:08
 * @Created by B105
 */
public class InitVedioIndex {
    private String cameraIndexCode;
    private Integer ezvizDirect;
    private Integer gpuMode;
    private Integer streamMode;
    private Integer transMode;
    private Integer wndId;

    //public InitVedioIndex(){}

    public InitVedioIndex(String cameraIndexCode){
        this.cameraIndexCode = cameraIndexCode;
        this.ezvizDirect = 0;
        this.gpuMode = 0;
        this.streamMode = 0;
        this.transMode = 1;
        this.wndId = -1;
    }

    public String getCameraIndexCode() {
        return cameraIndexCode;
    }

    public void setCameraIndexCode(String cameraIndexCode) {
        this.cameraIndexCode = cameraIndexCode;
    }

    public Integer getEzvizDirect() {
        return ezvizDirect;
    }

    public void setEzvizDirect(Integer ezvizDirect) {
        this.ezvizDirect = ezvizDirect;
    }

    public Integer getGpuMode() {
        return gpuMode;
    }

    public void setGpuMode(Integer gpuMode) {
        this.gpuMode = gpuMode;
    }

    public Integer getStreamMode() {
        return streamMode;
    }

    public void setStreamMode(Integer streamMode) {
        this.streamMode = streamMode;
    }

    public Integer getTransMode() {
        return transMode;
    }

    public void setTransMode(Integer transMode) {
        this.transMode = transMode;
    }

    public Integer getWndId() {
        return wndId;
    }

    public void setWndId(Integer wndId) {
        this.wndId = wndId;
    }
}
