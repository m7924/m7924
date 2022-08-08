package com.suyao.arch_common.entity.sys;

import lombok.Data;
import java.io.Serializable;

/**
 * @author Robod
 * @date 2020/8/9 17:30
 */
@Data
public class SysRole implements Serializable {

    private Integer id;
    private String roleName;
    private String roleDesc;


}
