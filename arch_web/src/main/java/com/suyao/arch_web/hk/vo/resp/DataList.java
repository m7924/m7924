package com.suyao.arch_web.hk.vo.resp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname DataList
 * @Description TODO
 * @Date 2022/7/21 14:20
 * @Created by B105
 */
public class DataList {
    private Integer total;
    private Integer pageNo;
    private Integer pageSize;
    private List<Base> list = new ArrayList();

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

    public List<Base> getList() {
        return list;
    }

    public void setList(List<Base> list) {
        this.list = list;
    }
}
