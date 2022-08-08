package com.suyao.arch_common.entity.sys;

import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Robod
 * @date 2020/8/9 17:29
 */
@Data
public class SysUser implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private Integer status;
    private List<SysRole> roles = new ArrayList<>();



}
