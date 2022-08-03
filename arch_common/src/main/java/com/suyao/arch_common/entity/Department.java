package com.suyao.arch_common.entity;

//import javax.persistence.*;

/**
 * @Classname Deparment
 * @Description TODO
 * @Date 2022/7/28 11:38
 * @Created by B105
 */
//@Entity
//@Table(name="deparment")
public class Department {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department(){}

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
