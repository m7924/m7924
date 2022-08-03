package com.suyao.arch_web.hk.vo.req;

/**
 * @Classname DeviceSearch
 * @Description TODO
 * @Date 2022/7/21 13:35
 * @Created by B105
 */
public class DeviceSearch {
    private Integer pageNo;
    private Integer pageSize;

    public DeviceSearch(Integer pageNo, Integer pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
