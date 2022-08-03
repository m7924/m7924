package com.suyao.arch_common.entity;

//import javax.persistence.*;
import java.io.Serializable;

/**
 * @Classname Role
 * @Description TODO
 * @Date 2022/7/28 11:44
 * @Created by B105
 */
//@Entity
//@Table(name="role")
public class Role implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动生成
    private Long id;
    private String name;

    public Role(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
