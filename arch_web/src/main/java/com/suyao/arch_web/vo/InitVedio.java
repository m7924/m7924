package com.suyao.arch_web.vo;

/**
 * @Classname InitVedio
 * @Description TODO
 * @Date 2022/7/27 16:43
 * @Created by B105
 */
public class InitVedio {
    private String appkey;
    private String ip;
    private Integer port;
    private String secret;
    private Integer enableHTTPS;
    private String layout;
    private Integer playMode;

    public InitVedio(){}
    public InitVedio(String appkey, String ip, Integer port, String secret,  Integer enableHTTPS, String layout, Integer playMode){
        this.appkey = appkey;
        this.ip = ip;
        this.port = port;
        this.secret = secret;
        this.enableHTTPS = enableHTTPS;
        this.layout = layout;
        this.playMode = playMode;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Integer getEnableHTTPS() {
        return enableHTTPS;
    }

    public void setEnableHTTPS(Integer enableHTTPS) {
        this.enableHTTPS = enableHTTPS;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getPlayMode() {
        return playMode;
    }

    public void setPlayMode(Integer playMode) {
        this.playMode = playMode;
    }
}
